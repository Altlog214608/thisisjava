package thisisjava.src.ch07;

public class Extends_exam {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("갤럭시", "검은색");

        System.out.println("모델" + smartPhone.model);
        System.out.println("색상" + smartPhone.color);

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

//다중 상속 불가
//여러개 클래스를 상속 받는 것 : 다중상속
