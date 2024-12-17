package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {
		float var1 = 0.1234567890123456789f;
		double var2 = 0.1234567890123456789;
		
		System.out.println("var 1:" + var1);
		System.out.println("var 2:" + var2);
		
		double var3 = 3e6;
		float var4 = 3e6F;
		double var5 = 2e-3;
		
		System.out.println("var 3:" + var3);
		System.out.println("var 4:" + var4);
		System.out.println("var 5:" + var5);
	}

}
