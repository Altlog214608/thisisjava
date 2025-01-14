package thisisjava.src.ch07;

public class SealedExample {
    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();
        e.work();
        m.work();
        d.work();
    }
}

sealed class Person permits Employee, Manager {
    public String name;

    public void work() {
        System.out.println("nope");
    }
}
final class Employee extends Person {
    @Override
    public void work(){
        System.out.println("생산");
    }
}
non-sealed class Manager extends Person{
    @Override
    public void work() {
        System.out.println("생산 관리");
    }
}
class Director extends Manager {
    @Override
    public void work(){
        System.out.println("기획");
    }
}
