package thisisjava.src.ch06;

public class SportsCar { //공개 클래스 public
    //클래스 변수 = new 클래스명(); 인스턴스 생성
    //클래스에 생성자를 개발자가 따로 정의하지 않으면
    //자동으로 컴파일 과정에서 생성자함수가 정의된다.
//
    String name;
    String color;
//

    SportsCar(String name,String color) {

    }

    public static void main(String[] args) {
        SportsCar s1 = new SportsCar("그랜져","검정");
        System.out.println("s1 변수가 SportsCar 객체를 참조합니다");

        SportsCar s2 = new SportsCar("모닝","노랑");
        System.out.println("s2 변수가 또 다른SportsCar 객체를 참조합니다");

        System.out.println(s1);
        System.out.println(s1.name);
        System.out.println(s1.color);
//
//        System.out.println(s2.name);
//        System.out.println(s2.color);

    }
}

