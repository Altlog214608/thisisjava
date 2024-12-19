package thisisjava.src.ch04.example;

public class Q2 {

	public static void main(String[] args) {
		String grade = "B";
		
		int score1 =  0;
		switch (grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 -20;
				score1 = result;
				break;
			default:
				score1 = 60;
		}	
		System.out.println("score1:"+ score1);
		
		
		String grade2 = "B";
		int score2 = switch(grade2) {
			case "A" -> 100;
			case "B" -> {
				int result = 100-20;
				yield result;
			}
			default -> 60;
		};
		System.out.println("score2:" + score2);
		

	}

}