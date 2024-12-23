package thisisjava.src.daily;

import java.util.Arrays;

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

        printItem(scores); // 함수의 호출

        //타입[] 식별자 = null;
        //식별자 = new 타입[길이];

        int[] intArray = new int[10];
        intArray[0] = 100;
        intArray[1] = 200;

        //초기 값(리터럴) 지정이 안되면 각 데이터 타입의 기본값으로 초기화된다
        //기본 데이터 타입들은 전부 0,0.0,null
        //참조 타입의 기본값 null

        int[] intArray2 = new int[30]; //기본값이 0으로 채워짐

        String names = Arrays.toString(new String[30]); // 기본값이 null로 채워짐

        int[] arr1 = new int[3];

        for(int i=0; i<arr1.length; i++) {
            System.out.println("arr1["+i+"]="+arr1[i]+",");
        }
        System.out.println();

        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;

        int sum2 = 0;

        for(int i=0; i<arr1.length; i++) {
            sum2 += arr1[i];
            System.out.println("arr1["+i+"]="+arr1[i]+",");
        }
        double avg2 = (double) sum2/ arr1.length;
        System.out.println("합계:"+sum2);
        System.out.println("평균:"+avg2);
        System.out.println();

        int[] arr2 = {10,20,30};

        for(int i=0; i<arr2.length; i++) {
            System.out.println("arr2["+i+"]="+arr2[i]+",");
        }
        System.out.println();

        double[] arr3 = new double[3];

        for(int i=0; i<arr3.length; i++) {
            System.out.println("arr3["+i+"]="+arr3[i]+",");
        }
        System.out.println();

        double[] arr4 = {10.1,20.2,30.3};

        for(int i=0; i<arr4.length; i++) {
            System.out.println("arr4["+i+"]="+arr4[i]+",");
        }
        System.out.println();

        arr3[0]=0.1;
        arr3[1]=0.2;
        arr3[2]=0.3;

        for(int i=0; i<arr3.length; i++) {
            System.out.println("arr3["+i+"]="+arr3[i]+",");
        }
        System.out.println();

        String[] arr5 = new String[3];
        for(int i=0; i<arr5.length; i++) {
            System.out.println("arr5["+i+"]="+arr5[i]+",");
        }
        System.out.println();

        arr5[0]="a";
        arr5[1]="b";
        arr5[2]="c";
        for(int i=0; i<arr5.length; i++) {
            System.out.println("arr5["+i+"]="+arr5[i]+",");
        }
        System.out.println();

        String[] arr6 = {"a","b","c"};

        for(int i=0; i<arr6.length; i++) {
            System.out.println("arr6["+i+"]="+arr6[i]+",");
        }

        int[][] scores2 = {{80,90,96},{76,88}};

        System.out.println("1차원 배열 길이(반의 수):"+scores2.length);
        System.out.println("2차원 배열 길이(첫번째 반의 학생수):"+scores2[0].length);
        System.out.println("2차원 배열 길이(두번째 반의 학생수):"+scores2[1].length);

        System.out.println("scores[0][2]:"+scores2[0][2]);

        System.out.println("scores[1][1]:"+scores2[1][1]);

        int class1sum= 0;
        for (int i=0; i<scores2[0].length; i++) {
            class1sum += scores2[0][i];
        }
        double class1avg = (double) class1sum / scores2[0].length;
        System.out.println("첫번재 반의 평균"+class1avg);

        int class2sum = 0;
        for (int i=0; i<scores2[1].length; i++) {
            class2sum += scores2[1][i];
        }
        double class2avg = (double) class2sum / scores2[1].length;
        System.out.println("두번째 반 평균"+class2avg);

        int totalStudent = 0;
        int totalSum = 0;
        for (int i=0; i<scores2.length; i++) {
            totalStudent += scores2[i].length;
            for (int j=0; j<scores2[i].length; j++) {
                totalSum += scores2[i][j];
            }
        }
        double totalavg = (double) totalSum / totalStudent;
        System.out.println("전체 평균 "+totalavg);

        //new 연산자로 다차원 배열 생성
        //int[][] x=new int[10][10]

        int[][] mathScores = new int[2][3];

        for(int i=0; i<mathScores.length; i++) {
            for(int j=0; j<mathScores[i].length; j++) {
                System.out.println("mathScores["+i+"]["+j+"]="+mathScores[i][j]);
            }
        }
        System.out.println();

        mathScores[0][0]=80;
        mathScores[0][1]=83;
        mathScores[0][2]=85;
        mathScores[1][0]=86;
        mathScores[1][1]=90;
        mathScores[1][2]=92;

        int totalStudent2 = 0;
        int totalMathSum = 0;
        for (int i = 0; i < mathScores.length; i++) {
            totalStudent2 += mathScores[i].length;
            for (int j = 0; j < mathScores[i].length; j++) {
                totalMathSum += mathScores[i][j];
            }
        }
        double totalMathAvg = (double) totalMathSum / totalStudent2;
        System.out.println("전체 학생의 수학 평균 점수:"+totalMathAvg);
        System.out.println();


        int[][] englishScores2 = new int[2][];
        englishScores2[0]=new int[2];
        englishScores2[1]=new int[3];

        for(int i=0; i<englishScores2.length; i++) {
            for(int j=0; j<englishScores2[i].length; j++) {
                System.out.println("englishScores2["+i+"]["+j+"]="+englishScores2[i][j]);
            }
        }
        System.out.println();

        englishScores2[0][0]=90;
        englishScores2[0][1]=91;
        englishScores2[1][0]=92;
        englishScores2[1][1]=93;
        englishScores2[1][2]=94;


        totalStudent2 = 0;
        int totalEnglishSum2 = 0;
        for (int i = 0; i < englishScores2.length; i++) {
            for (int j = 0; j < englishScores2[i].length; j++) {
                totalEnglishSum2 += englishScores2[i][j];
            }
        }
        double totalEnglishAvg2 = (double) totalEnglishSum2 / englishScores2.length;
        System.out.println("전체 학생의 영어 평균 점수"+totalEnglishAvg2);

    }

    public static void printItem(int[] scores){
        for(int i=0; i<scores.length; i++) {
            System.out.println("scores["+i+"]="+scores[i]);
        }
    }// 사용자 함수 선언 정의 //void는 반환값이 없는 함수라는 의미

}
