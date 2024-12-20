package thisisjava.src.ch05;

public class ReferenceVariableCompareExample {
    public static void main(String[] args) {
        int[] arr1; // 정수배열타입의 변수 arr1을 선언
        int[] arr2;
        int[] arr3;

        arr1 = new int[] {1,2,3}; //arr1변수에 정수배열 객체를 생성해서 {1,2,3}값을 초기화
        arr2 = new int[] {1,2,3};
        arr3 = arr2; //arr 3에다가 arr2번 번지수를 대입

        System.out.println(arr1 == arr2);
        System.out.println(arr2 == arr3);

        int[] intArr = null;
        intArr[0] = 10;
    }
}
