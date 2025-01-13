package thisisjava.src.ch07;

public class Extends_exam {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시", "검은색");

        System.out.println("모델" + smartPhone.model);
        System.out.println("색상" + smartPhone.color);

        int r = 10;
        Calculator calculator = new Calculator();
        System.out.println(calculator.areaCircle(r));

        Computer computer = new Computer();
        System.out.println(computer.areaCircle(r));

        SuperSonicAirplane sa = new SuperSonicAirplane();
        sa.takeOff();
        sa.fly();
        sa.flymode = SuperSonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flymode = SuperSonicAirplane.NORMAL;
        sa.fly();
        sa.land();

        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // B b3 = e;
        // C c2 = d;
    }
}

class Phone {
    public String model;
    public String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
        System.out.println("Phone()생성자 실행");
    }
}

class SmartPhone extends Phone {
    public SmartPhone(String model, String color){
        super(model, color);
        System.out.println("스마트폰 생성자 실행");
    }
}

class Calculator {
    public double areaCircle(double r) {
        System.out.println("Cal_area");
        return 3.14159* r * r;
    }
}

class Computer extends Calculator {
    @Override
    public double areaCircle(double r){
        System.out.println("Com_area");
        return Math.PI * r * r;
    }
}

class Ariplane {
    public void land() {
        System.out.println("착륙합니다");
    }
    public void fly() {
        System.out.println("일반 비행합니다.");
    }
    public void takeOff() {
        System.out.println("이륙 합니다.");
    }
}

class SuperSonicAirplane extends Ariplane {
    public static final int NORMAL = 1;
    public static final int SUPERSONIC = 2;

    public int flymode = NORMAL;

    @Override
    public void fly() {
        if(flymode == SUPERSONIC) {
            System.out.println("초음속 비행합니다");
        } else {
            super.fly();
        }
    }
}

class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}





//다중 상속 불가
//여러개 클래스를 상속 받는 것 : 다중상속
//부모 클래스의 생성자가 매개변수가 있다면 -> 자식 생성자 내부에 super(매개변수1, 매개변수2) 작성해야한다
//부모 클래스의 생성자가 매개변수가 없다면 -> 자식 생성자 내부에 super() 생략 가능
//super 키워드를 통한 부모 클래스 필드 접근 가능 => super.필드명
//부모클래스의 필드가 private으로 선언되어 있으면 자식 클래스에서 접근 불가
//자식클래스에서 부모클래스로 접근하려면 부모클래스에 해당 필드가 public 이나 protected여야함
//super()는 자식 클래스에서 부모 생성자 호출 방식
//super.메서드명 형태로 부모클래스 내 메서드 호출 가능
