package thisisjava.src.ch06;

public class SportsCar { //공개 클래스 public
    //클래스 변수 = new 클래스명(); 인스턴스 생성
    public static void main(String[] args) {
        SportsCar s1 = new SportsCar();
        System.out.println("s1 변수가 SportsCar 객체를 참조합니다");

        SportsCar s2 = new SportsCar();
        System.out.println("s2 변수가 또 다른SportsCar 객체를 참조합니다");
    }

}
class Tire {

}

