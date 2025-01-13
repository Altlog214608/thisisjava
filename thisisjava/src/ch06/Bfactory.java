package thisisjava.src.ch06;

import java.util.Scanner;

public class Bfactory {
    static int Bfactory_funds = 10000000;
    static int tire_count;
    static String name;
    static boolean buy_car = true;

    Bfactory() {

    }

    Bfactory(int count, String name) {
        this.tire_count = count;
        this.name = name;
    }

    static String complte_car(int tire_count, String name) {
        if(check_count()) {
            Bfactory b = new Bfactory(tire_count, name);
            Bfactory.tire_count -= 4;
            buy_car = true;
        }
        else {
            System.out.println("휠 개수 부족으로 생산 불가");
            buy_car = false;
        }
        return Bfactory.name;
    }

    static int getBfactory_funds(){
        return Bfactory.Bfactory_funds;
    }

    static void setBfactory_funds(int final_price){
        Bfactory.Bfactory_funds -= final_price;
    }

    static boolean check_count() {
        if (Bfactory.tire_count / 4 >= 1) {
            return true;
        }
        else {
            return false;
        }
    }

    static int buy_wheel(){
        Afactory.Bfactory_sell = true;
        Bfactory.tire_count = Afactory.sell_wheel();
        setBfactory_funds(Afactory.getFinal_price());
        return tire_count;
    }

    static String buy_car(String car) {
        Bfactory.name = car;
        String car_name = complte_car(buy_wheel(),Bfactory.name);
        if (buy_car == true) {
            String answer = car_name + "구매 완료";
            return answer;
        } else {
            String answer = "구매 실패";
            return answer;
        }
    }

    static String input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("구매하려는 차 모델명을 입력해주세요");
        String car = sc.nextLine();
        return car;
    }

    public static void main(String[] args) {
        System.out.println(Bfactory.buy_car(input()));
    }

}

class Afactory {
    static int wheel_count;
    static int size;
    static boolean Bfactory_sell = false;
    private static int TIRE_PRICE = 500000;//개당 타이어가격
    static int final_price;
    static int Afactory_funs = 10000000;
    static Afactory[] wheel_list = new Afactory[10];

    Afactory () {}

    Afactory (int size, int TIRE_PRICE) {
        this.size = size;
        this.TIRE_PRICE = TIRE_PRICE;
    }

    static Afactory make_wheel() {
        Afactory wheel = new Afactory(Afactory.size, Afactory.TIRE_PRICE);
        Afactory.wheel_count += 1;
        return wheel;
    }

    static int getFinal_price(){
        return final_price;
    }

    static int sell_wheel() {
        if(Afactory.Bfactory_sell == true) {
            for(int i = 0 ; i < 4 ; i++){
                wheel_list[i] = make_wheel();
                final_price += TIRE_PRICE;
            }
            wheel_count = wheel_list.length;
            Afactory.Afactory_funs += final_price;
        }
        else{
            System.out.println("구매요청 없음");
        }
        return Afactory.wheel_count;
    }
}