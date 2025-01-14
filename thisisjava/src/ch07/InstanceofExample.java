package thisisjava.src.ch07;

public class InstanceofExample {
    public static void personInfo(Person person){
        //main() 메소드에서 바로 호출하기 위해 정적 ㅔㅁ소드 선언
        System.out.println("name"+ person.name);
        person.walk();

          //person이 참조하는 객체가 Student 타입인지 확인
//        //매개값이 Student인 경우에만 강제 타입 변환해서 studentNo 필드와 study()메소드 사용
//        if (person instanceof Student) {
              //Student 객체일 경우 강제 타입 변환
//            Student student = (Student) person;
              //Student 객체만 가지고 있는 필드 및 메소드 사용
//            System.out.println("studnetNo"+student.studentNo);
//            student.study();
//        }

        //자바12부터 사용 가능

        if(person instanceof Student student){
            System.out.println("studnetNo"+student.studentNo);
            student.study();

        }
    }

    public void main(String[] args) {
        Person p1 = new Person("홍길동");
        personInfo(p1);

        System.out.println();

        Person p2 = new Student("김길동",10);
        personInfo(p2);
    }

    class Person {
        public String name;

        public Person(String name){
            this.name = name;
        }

        public void walk(){
            System.out.println("걷기");
        }
    }
    class Student extends Person{
        public int studentNo;

        public Student(String name, int studentNo){
            super(name);
            this.studentNo = studentNo;
        }

        public void study(){
            System.out.println("공부합니다.");
        }
    }
}
