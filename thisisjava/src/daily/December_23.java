package thisisjava.src.daily;

public class December_23 {
    public static void main(String[] args) {


        //배열
        //보통 변수는 하나의 값만 저장 가능
        //저장하려는 값이 여러 개 => 배열을 사용한다.
        //배열 데이터 타입 String 처럼 객체 타입이다.

        //리스트와 공통점
        //배열의 각 요소는 인덱스를 통해 조회/저장 가능
        //인덱스는 대괄호 [] 사용

        //리스트와 차이점
        //배열은 연속된 메모리 공간에 값을 나열 시킨다.
        //배열은 같은 타입의 값만 저장 가능
        //배열의 길이는 늘리거나 줄일 수 없음

        //배열 변수의 선언

        //타입[] 변수명;
        //타입 변수명[];

        //int[] intArray;
        //String[] strArray;

        //int intArray[];
        //String strArray[];

        //int[] x={1,2,3,4,5}

        String[] season = {"Spring","Summer","Autumn","Winter"};
        System.out.println("season[0]"+season[0]);
        System.out.println("season[1]"+season[1]);
        System.out.println("season[2]"+season[2]);
        System.out.println("season[3]"+season[3]);

        season[2]="가을"; //인덱스를 통한 값 변경
        System.out.println("season[2]"+season[2]);

        int[] scores = {83,90,87};

        int sum = 0;
        for(int i=0; i<3; i++) {
            sum += scores[i];
        }
        System.out.println("총합: "+sum);
        double avg = (double) sum/ 3;
        System.out.println("평균: "+avg);


    }
}
