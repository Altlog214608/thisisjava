package thisisjava.src.ch07;

import java.util.Objects;
import java.util.Scanner;

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

//        Account account = new Account();
//
//        account.setBalance(10000);
//        System.out.println("현재 잔고: " + account.getBalance());
//
//        account.setBalance(-100);
//        System.out.println("현재 잔고: " + account.getBalance());
//
//        account.setBalance(2000100);
//        System.out.println("현재 잔고: " + account.getBalance());
//
//        account.setBalance(300000);
//        System.out.println("현재 잔고: " + account.getBalance());

        BankApplication.run();


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
    static String name;
    static String account_num;
    static String first_balance;

    static void setBalance(int balance) {
        if (balance < MIN_VALUE || balance > MAX_VALUE) {
            balance = Account.balance;
        } else {
            Account.balance += balance;
        }
    }

    static int getBalance() {
        return Account.balance;
    }

    private static Account account = new Account(account_num,name,first_balance);

    private Account(String account_num ,String name, String first_balance) {
        Account.account_num = account_num;
        Account.name=name;
        Account.first_balance = first_balance;
    }

    static void Withdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------");
        System.out.println("출금");
        System.out.println("-------");
        System.out.print("계좌번호:");
        String account_num = sc.nextLine();
        if (Objects.equals(account_num, Account.account_num)) {
            System.out.println("출금액:");
        }
        int with = sc.nextInt();
        if (with > Account.getBalance()) {
            System.out.println("실패");
        } else {
            Account.balance -= with;
            System.out.println("현재 잔고: " + Account.getBalance());
            System.out.println("출금 성공");
        }
    }

    static void Deposit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("-------");
        System.out.println("예금");
        System.out.println("-------");
        System.out.print("계좌번호:");
        String account_num = sc.nextLine();
        if (Objects.equals(account_num, Account.account_num)) {
            System.out.println("예금액:");
            int deposit = sc.nextInt();
            Account.balance += deposit;
            System.out.println("현재 잔고: " + Account.getBalance());
        }
    }

    static Account getInstance(){
        return account;
    }

    static void get_account() {
        System.out.println("-------");
        System.out.println("계좌생성");
        System.out.println("-------");
        Scanner sc = new Scanner(System.in);
        System.out.print("계좌번호:");
        account_num = sc.nextLine();
        System.out.print("계좌주:");
        name = sc.nextLine();
        System.out.print("초기입금액:");
        first_balance = sc.nextLine();
        BankApplication.account_list = new Account[]{getInstance()};
        System.out.println("결과: 계좌가 생성되었습니다.");
        Account.balance = Integer.parseInt(Account.first_balance);
    }

}

class BankApplication {
    static Account[] account_list = new Account[100];
    private static String select;

    static String start_str() {
        System.out.println("---------------------------------------------");
        System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
        System.out.println("---------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("선택> ");
        BankApplication.select = sc.nextLine();
        return select;
    }

    BankApplication bankApplication = new BankApplication();

    static void getAccountList() {
        System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");
        for (Account account : account_list) {
            System.out.println(Account.account_num+"\t"+Account.name+"\t"+Account.balance);
        }
    }

    static void run(){
        while (true) {
            start_str();
            if(Objects.equals(select, "1")) {
                Account.get_account();
            } else if (Objects.equals(select, "2")){
                getAccountList();
            } else if (Objects.equals(select, "3")){
                Account.Deposit();
            } else if (Objects.equals(select, "4")){
                Account.Withdrawal();
            } else if (Objects.equals(select, "5")) {
                break;
            }

        }
    }
}