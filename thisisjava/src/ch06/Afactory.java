package thisisjava.src.ch06;

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
