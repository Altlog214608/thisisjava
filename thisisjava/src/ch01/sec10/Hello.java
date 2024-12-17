package ch01.sec10;

public class Hello {

	public static void main(String[] args) {
		int x =1;
		int y =2;
		int result = x + y;
		System.out.println(result);
		
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
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
		byte var6 = 127;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
		char c1 = 'A';
		char c2 = 65;
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		float var11 = 0.1234567890123456789f;
		double var22 = 0.1234567890123456789;
		
		System.out.println("var 1:" + var11);
		System.out.println("var 2:" + var22);
		
		double var33 = 3e6;
		float var44 = 3e6F;
		double var55 = 2e-3;
		
		System.out.println("var 3:" + var33);
		System.out.println("var 4:" + var44);
		System.out.println("var 5:" + var55);
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다");
		}
		else {
			System.out.println("시작합니다");
		}
		
		int a = 10;
		boolean result1 = (a==20);
		boolean result2 = (a!=20);
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		
		//String 문자열 타입
		String stringVar ="DDDD";
		
		byte byteValue = 10;
		int intValue=byteValue; //자동 타입 변환
		
		//정수타입이 실수타입으로 대입되는 경우 무조건 변환된다.
		
		char charValue='A';
		int intV=charValue; 
		System.out.println(intV);
		
		byte resultA = 10 +20;
		System.out.println("resultA"+resultA);
		
		byte v1 = 10;
		byte v2 = 20;
		int resultB = v1 + v2;
		System.out.println("resultB"+resultB);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long resultC = v3 + v4 + v5;
		System.out.println("resultC"+resultC);
		
		char v6 = 'A';
		char v7 = 1;
		int resultD = v6 + v7;
		System.out.println("resultD"+resultD);
		System.out.println("resultD"+(char)resultD);
		
		int v8 = 10;
		int resultE = v8 /4;
		System.out.println("resultE"+resultE);
		
		int v9 = 10;
		double resultF = v9 /4.0;
		System.out.println("resultF"+resultF);
		
		int v10 = 1;
		int v11 = 1;
		double resultG = (double)v10/v11;
		System.out.println("resultG"+resultG);
		
		
		
		
	}

}
