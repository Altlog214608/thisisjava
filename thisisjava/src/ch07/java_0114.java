package thisisjava.src.ch07;

public class java_0114 {
    public void main(String[] args) {
        Parent parent = new Child();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();

        Child child = (Child) parent;

        child.field2 = "data2";
        child.method3();

        Car mycar = new Car();

        mycar.tire = new Tire();
        mycar.run();

        mycar.tire = new HankookTire();
        mycar.run();

        mycar.tire = new KumhoTire();
        mycar.run();

        Gun mygun = new Gun();

        mygun.bullet = new Bullet();
        mygun.shoot();

        mygun.bullet = new RedBullet();
        mygun.shoot();

        mygun.bullet = new BlueBullet();
        mygun.shoot();

        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);

        Taxi taxi = new Taxi();
        driver.drive(taxi);


    }

    //자식타입 변수 = (자식타입)부모타입인스턴스; //강제 형변환
    //부모타입 변수 = 자식인스턴스; // 자동형변환
    //부모를 상속받은 자식인스턴스가
    //부모타입으로 자동형변환되면 부모타입에 선언된 필드와 메서드만 사용가능

    class Parent {
        public String field1;

        public void method1() {
            System.out.println("Parent-method1");
        }

        public void method2() {
            System.out.println("Parent-method2");
        }
    }
    class Child extends Parent{
        public String field2;

        public void method3(){
            System.out.println("Child-method3()");
        }
    }

    class Tire {
        public void roll(){
            System.out.println("회전");
        }
    }
    class HankookTire extends Tire{
        @Override
        public void roll(){
            System.out.println("한국 회전");
        }
    }
    class KumhoTire extends Tire{
        @Override
        public void roll(){
            System.out.println("금호 회전");
        }
    }

    class Car{
        private Tire tire;
        public void run(){
            tire.roll();
        }
    }

    //클래스의 종류
    //총기 - Car
    //격발함수- Car-run()
    //기본총알(은색) - 은색총알이 날아간다 - Tire
    //빨간총알 빨간총알이 날아간다 - "" 날아간다 - roll()
    //파란총알 파란총알이 날아간다 -

    class Gun {
        private Bullet bullet;

        public void shoot(){
            bullet.shootBullet();
        }
    }
    class Bullet{
        public void shootBullet() {
            System.out.println("총알이 날아간다");
        }
    }

    class RedBullet extends Bullet{
        @Override
        public void shootBullet(){
            System.out.println("빨간 총알이 날아간다");
        }
    }
    class BlueBullet extends Bullet{
        @Override
        public void shootBullet(){
            System.out.println("파란 총알이 날아간다");
        }
    }

    class Vehicle {
        public void run() {
            System.out.println("차량이 달립니다");
        }
    }
    class Bus extends Vehicle{
        @Override
        public void run() {
            System.out.println("버스가 달립니다");
        }
    }
    class Taxi extends Vehicle{
        @Override
        public void run() {
            System.out.println("택시가 달립니다");
        }
    }
    class Driver {
        private void drive(Vehicle vehicle){
            vehicle.run();
        }
    }
}
