package thisisjava.src.ch04.example;

public class Q6 {
	public static void main(String[] args) {
		String star = "*";

		for (int i = 2; i<= 10; i+=2) {
			for(int j = 1; j<=i; j++) {
				System.out.print(star);
				if(j == i) {
					System.out.println();
				}
			}
		}
	}
}
