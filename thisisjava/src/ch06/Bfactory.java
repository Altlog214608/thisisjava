package thisisjava.src.ch06;

import java.util.Scanner;

public class Bfactory {
//    static int count;
    static int Bfactory_funds = 10000000;
    static int tire_count;
    static int wheel_price = 2000000;
    static String name;

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
        Bfactory_funds -= wheel_price;
//        Afactory.funds += wheel_price;
        return tire_count;
    }

    static void buy_car(String car) {
        Bfactory.name = car;
        String car_name = complte_car(buy_wheel(),Bfactory.name);
        String answer = car_name+ "구매 완료";
        System.out.println(answer);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("구매하려는 차 모델명을 입력해주세요");
        String car = sc.nextLine();
        Bfactory.buy_car(car);
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