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
    }
}
