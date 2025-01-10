package thisisjava.src.ch06;
//휠타이어 제품을 만드는 A공장 -> 휠타이어 1개
//자동차를 만드는 B공장 ->
//A제품은 B공장의 제품을 만들기 위한 부품이다
//B공장은 A공장에게 일정 수량을 구매하고 개당 50만원 가격을 지불
//휠타이어 4개를 사와야 B공장 자동차 1개를 만들 수 있다.
//A -> B로 휠타이어 x개를 옮겨주는 배송 함수
//휠 타이어 없는 자동차 만들기 (B인스턴스 생성)
//휠 사이즈 (필드)
//휠 타이어 만들기 기능(A인스턴스 생성)
//휠 타이어 장착 (A인스턴스 4개가 B인스턴스 1개에 포함)
//휠 타이어 가격계산기능 (A공장 클래스메서드)
//휠 타이어 구매 수량 필드 (A,B 둘 다 클래스메서드를 통한 필드)
//휠타이어 구매 기능 (B공장 클래스메서드)
//공장 자금 필드  (클래스 변수)
//B공장에서 휠타이어 4배수 단위 구분 기능(B인스턴스 메서드에서 호출해야 할 듯)
//A공장 클래스, B공장 클래스
//휠타이어, 이름, 가격, 만들어진 타이어
//가지고 있는 타이어 개수,
//공장 위치 (a,b 각각 클래스 변수)
//B공장의 휠타이어 장착전 재고와 장착후재고 수량 파악(b 클래스 변수)
//B공장은 휠타이어가 재료가 있어야 가동(b 클래스 메서드)

import java.util.Scanner;

public class Bfactory {
//    static int count;
    static int Bfactory_funds = 10000000;
    static int tire_count;
    static int wheel_price = 2000000;
    static String name="소나타";

    Bfactory() {

    }

    Bfactory(int a, String name) {
        this.tire_count = a;
        this.name = name;
    }

    static String complte_car(int tire_count, String name) {
        if(check_count()) {
            Bfactory b = new Bfactory(tire_count, name);
        }
        else {
            System.out.println("휠 개수 부족으로 생산 불가");
        }
        return Bfactory.name;
    }

    static boolean check_count() {
        if (Bfactory.tire_count % 4 ==0) {
            return true;
        }
        else {
            return false;
        }
    }

    static int buy_wheel(){
        Afactory.Bfactory_sell = true;
        Bfactory.tire_count = 4;
        Bfactory.Bfactory_funds -= wheel_price;
//        Afactory.funds += wheel_price;
        return tire_count;
    }

    static void buy_car() {
        String car_name = complte_car(buy_wheel(),Bfactory.name);
        String answer = car_name+ "구매 완료";
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Bfactory.buy_car();
        System.out.println(Bfactory.Bfactory_funds);
        System.out.println(Bfactory.wheel_price);
    }
}

class Afactory {
    static boolean Bfactory_sell = false;
    private static int TIRE_PRICE = 500000;//타이어가격
    private static int sellTiers(int quantity) {
        return quantity * TIRE_PRICE; //구매
    }

    String tier;//count
    String size;
}