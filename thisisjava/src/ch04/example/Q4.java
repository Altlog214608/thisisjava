package ch04.example;

public class Q4 {

	public static void main(String[] args) {
		
		int result = 0;
		boolean run = true;
		while(run) {
			int dice1 = (int)(Math.random() * 6) + 1;
			int dice2 = (int)(Math.random() * 6) + 1;
			result = dice1 + dice2;
			if (result == 5) {
				System.out.println("dice1:"+dice1+"dice2:"+dice2);
				run = false;
			}
			else {
				continue;
			}
		}
	}
}
