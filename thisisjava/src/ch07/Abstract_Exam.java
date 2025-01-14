package thisisjava.src.ch07;

public abstract class Abstract_Exam {
    String owner;

    Abstract_Exam(String owner){
        this.owner = owner;
    }

    void turnOn() {
        System.out.println("On");
    }
    void turnOff() {
        System.out.println("OFF");
    }

    //abstract 추상 클래스는 인스턴스 생성용도가 아니다.
    //추상클래스의 반대 의미는 실체클래스
    //실체클래스는 실제 인스턴스를 생성하여 프로그램 내 상호작용을 실질적으로 하는 클래스
    //추상 클래스는 실체 클래스의 상속용도로 사용

    //추상메서드 선언
    //abstract void sound(매개변수); //하나의 필드로서 형태만 미리 정의함 _ 추상클래스 내부에
    //추상메서드 선언하는 이유


    public static void main(String[] args) {
        SmartPhone2 smartPhone2 = new SmartPhone2("홍길동");

        smartPhone2.turnOff();
        smartPhone2.turnOn();
        smartPhone2.internetSearch();
    }

}

class SmartPhone2 extends Abstract_Exam {
    SmartPhone2(String owner){
        super(owner);
    }

    void internetSearch(){
        System.out.println("search");
    }

}
