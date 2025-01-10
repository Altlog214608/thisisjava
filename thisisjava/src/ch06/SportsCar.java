package thisisjava.src.ch06;

public class SportsCar { //공개 클래스 public
    //클래스 변수 = new 클래스명(); 인스턴스 생성
    //클래스에 생성자를 개발자가 따로 정의하지 않으면
    //자동으로 컴파일 과정에서 생성자함수가 정의된다.

    //오버라이딩: 상속받은 클래스(자식)가 상속해준 클래스(부모)
    //내부에 선언된 특정 함수를 같은 이름으로 새롭게 정의하는 행위

    //오버로딩: 상속과 무관하게 클래스 내부에 같은 이름 함수를 여러개
    //만드는 것

    String name;
    String color;
    int max_speed;
//

    SportsCar(String name) {
        this(name,"검정",250);
    }

    SportsCar(String name,String color) {
        this(name,color,300);
    }

    SportsCar(String name,String color,int max_speed) {
        this.name = name;
        this.color = color;
        this.max_speed = max_speed;
    }

    void powerOn() {
        System.out.println("on");
    }

    void powerOff() {
        System.out.println("off");
    }

    int plus(int x, int y ) {
        int result = x + y;
        return result;
    }

    double divide(int x, int y) {
        double result = (double) x / (double) y;
        return result;
    }

    public static void main(String[] args) {
        SportsCar s1 = new SportsCar("그랜져","검정");
        System.out.println("s1 변수가 SportsCar 객체를 참조합니다");

        SportsCar s2 = new SportsCar("모닝","노랑",200);
        System.out.println("s2 변수가 또 다른SportsCar 객체를 참조합니다");

        SportsCar s3 = new SportsCar("소나타");

        System.out.println(s1.name);
        System.out.println(s1.color);

        System.out.println(s2.name);
        System.out.println(s2.color);
        System.out.println(s2.max_speed);

        System.out.println(s3.name);

        System.out.println(s1.plus(5,7));
        System.out.println(s1.divide(5,7));
        s1.powerOn();
        s1.powerOff();
    }

}

class Tire{

}