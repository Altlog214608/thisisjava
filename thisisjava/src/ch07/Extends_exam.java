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

//다중 상속 불가
//여러개 클래스를 상속 받는 것 : 다중상속
//부모 클래스의 생성자가 매개변수가 있다면 -> 자식 생성자 내부에 super(매개변수1, 매개변수2) 작성해야한다
//부모 클래스의 생성자가 매개변수가 없다면 -> 자식 생성자 내부에 super() 생략 가능
