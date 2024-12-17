package ch02.sec01;

public class VariableUseExample {

	public static void main(String[] args) {
		int hour =3;
		int minute = 5;
		System.out.println(hour+"시간"+ minute+"분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총: "+totalMinute+"분");

		//자바에서는 변수 선언시 데이터 타입을 지정해야 함.
		//정수/실수/논리
		//1. 정수 타입은 총 5가지
		// byte 1byte
		// short 2byte
		// char 2byte
		// int 4byte
		// long 8byte
		// 데이터 타입에 따라 값의 표현 범위가 달라짐
		// 1byte = 8bit
		// 2byte = 16bit
		// 4byte = 32bit
		// 8byte = 64bit
		
		//1바이트의 표현 범위 -128~127
		//파이썬에서는 문자 문자열 구분X
		//문자 값은 유니코들 변환되어 저장
		
		
	}

}
