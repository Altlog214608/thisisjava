package thisisjava.src.ch07;

public class main_exam {
    public static void action(A2 a2){
        a2.method1();
        if(a2 instanceof C2 c2){
            c2.method2();
        }

    }
    public static void main(String[] args) {
        Child child = new Child();

        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.run();
        tire.run();

        MainActivity mc = new MainActivity();
//        mc.onCreate();

        action(new A2());
        action(new B2());
        action(new C2());
    }

}
class Parent{
    public String nation;

    public Parent() {
        this("대한민국");
        System.out.println("Parent() call");
    }
    public Parent(String nation){
        this.nation = nation;
        System.out.println("Parent(String nation) call");
    }
}
class Child extends Parent {
    public String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }
    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }
}

class Tire {
    public void run(){
        System.out.println("일타");
    }
}
class SnowTire extends Tire{
    @Override
    public void run() {
        System.out.println("스타");
    }
}

abstract class Machine {
    public void powerOn() {}
    public void powerOff() {}
    public abstract void work();
}

class Computer2 extends Machine{
    @Override
    public void work(){
    }
}

class Activity {
    public void onCreate() {
        System.out.println("기본");
    }
}
class MainActivity extends Activity{
    @Override
    public void onCreate(){
        this.onCreate();
        System.out.println("추가");
    }
}

class A2 {
    public void method1() {
        System.out.println("A-method1");
    }
}
class B2 extends A2{
    public void method1() {
        System.out.println("B-method1");
    }
}
class C2 extends A2 {
    public void method1() {
        System.out.println("C-method1");
    }
    public void method2() {
        System.out.println("C-method2");
    }
}