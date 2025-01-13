package thisisjava.src.ch07;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }

    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("같은 싱글톤 객체");
        } else {
            System.out.println("다른 싱글톤 객체");
        }

        Memberservice memberservice = new Memberservice();
        boolean result = memberservice.login("hong","12345");
        if(result) {
            System.out.println(("login"));
            memberservice.logout("hong");
        } else {
            System.out.println("no");
        }

        Printer printer = new Printer();
        printer.println(10);
        printer.println(true);
        printer.println(5.7);
        printer.println("홍길동");

        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(2000100);
        System.out.println("현재 잔고: " + account.getBalance());

        account.setBalance(300000);
        System.out.println("현재 잔고: " + account.getBalance());




    }
}
class Memberservice {
    boolean login(String id, String password) {
        if (id == "hong") {
            if (password == "12345") {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }
    void logout(String id) {
        System.out.println(id + "님이 로그아웃 되었습니다.");
    }
}

class Printer{
    public void println() {
        println(0);
    }
    public void println(int a){
        System.out.println(a);
    }
    public void println(String a){
        System.out.println(a);
    }
    public void println(double a){
        System.out.println(a);
    }
    public void println(boolean a){
        System.out.println(a);
    }
}

class ShopService{
    private static ShopService shopService = new ShopService();

    private ShopService() {}

    public static ShopService getInstance(){
        return shopService;
    }
}

class Account {
    static int balance;
    static final int MIN_VALUE = 0;
    static final int MAX_VALUE = 1000000;

    static void setBalance(int balance) {
        if (balance < MIN_VALUE || balance > MAX_VALUE) {
            balance = Account.balance;
        } else {
            Account.balance = balance;
        }
    }
    static int getBalance() {
        return Account.balance;
    }
}