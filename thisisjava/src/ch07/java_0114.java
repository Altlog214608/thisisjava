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
}
