package thisisjava.src.ch06;

public class java_20250113 {
    //Static 사용 특징

    //static변수(클래스변수)는 메모리에 로드될 때 초기화되어 클래스의 모든 인스턴스가 공유한다.
    //static으로 선언된 변수와 메서드는 객체를 생성하지 않고 클래스이름을 통해 호출한다.
    //static 메서드는 인스턴스 변수나 인스턴스 메서드를 직접 참조할 수 없음, 정적 변수와 정적 메소드만
    //static 메소드 내에서는 this 키워드를 사용할 수 없음.
    //static 메소드는 오버라이딩 될 수 없음

    //final 타입 필드명 = 값 // 값 변경 X 인 필드에 final 키워드를 붙임
    //final 필드에 값이 할당되지 않으면 오류 발생

    //생성자에서 final필드에 어떤 값을 초기화한다. this를 통해서

    //상수
    //constant
    //불변의값
    //상수는 객체마다 저장할 필요가 없음 Math.pi
    //인스턴스 전용 필드가 아니다
    //final + static의 성질
    //static final int x = 10

    //초기값 선언시 static블럭을 이용하여 초기화
    //변수의 선언시 동시에 값 초기화

    //상수명은 전체식별자명을 대문자로 처리
    //인스턴스.상수(x) 접근 x
    //클래스명.상수(o) 접근 o

    //다른 패키지에 접근하려면 import
    //import를 여러개 했을 때 동일한 class명이 겹치면 인스턴스 만들 때 (패키지명.클래스이름) 클래스위치를
    //전체 지정해주어야 함


//    final String nation = "대한민국";
//    final String ssn;

//    String name;
//
//    public java_20250113(String ssn, String name) {
//        this.ssn = ssn;
//        this.name = name;
//    }
//
//    static final double EARTH_RADIUS = 6400;
//    static final double EARTH_SURFACE_AREA;
//
//    static {
//        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
//    }

    java_20250113 a1 = new java_20250113(true);
    java_20250113 a2 = new java_20250113(1);
    java_20250113 a3 = new java_20250113("문자열");

    public java_20250113(boolean b){}
    java_20250113(int b){}
    private java_20250113(String s){}

    public int field1;
    int field2;
    private int field3;

    public java_20250113() {
        field1 = 1;
        field2 = 1;
        field3 = 1;

        method1();
        method2();
        method3();
    }

    public void method1(){}
    void method2(){}
    private void method3(){}
//
//    public static void main(String[] args) {
////        java_20250113 k1 = new java_20250113("123456-1234567", "김동현");
////
////        System.out.println(k1.nation);
////        System.out.println(k1.name);
////        System.out.println(k1.ssn);
////
////        k1.name = "감자칩";
////        System.out.println(k1.name);
////
////        //------------------------------------------------------------------------
////
////        System.out.println("지구의 반지름" + java_20250113.EARTH_RADIUS + "km");
////        System.out.println("지구의 표면적" + java_20250113.EARTH_SURFACE_AREA + "km^2");
//    }
}
