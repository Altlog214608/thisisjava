package thisisjava.src.ch05;

public class EqualsExample {
    public static void main(String[] args) {
        String strVar1 = "홍길동";
        String strVar2 = "홍길동";

        if(strVar1==strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        };

        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("홍길동");
        String strVar4 = new String("홍길동");


        if(strVar3==strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }


        //문자열을 리터럴로 생성 : 힙에 같은 객체가 있으면 재활용
        //new키워드로 생성하는 것 : 같은 객체 있어도 무조건 새롭게

        String subject = "자바 프로그래밍";
        char ch = subject.charAt(3);
        System.out.println(ch);
        int length = subject.length();
        System.out.println(length);
        String newSubject = subject.replace("자바","JAVA");
        System.out.println(newSubject);

        //문자열 객체 변경 함수: replace()
        //문자열 잘라내기 함수: substring() , python은 slice
        //substring(시작)

        // String s = "abcd";
        // s.substring(시작)

        String ssn = "880815-1234567";

        String firstNum = ssn.substring(0,6);
        System.out.println(firstNum);

        String lastNum = ssn.substring(7);
        System.out.println(lastNum);
    }
}
