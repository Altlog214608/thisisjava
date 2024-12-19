package ch04.example;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean start = true;
		int bank = 0;
		while(start){
			System.out.println("=============================");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("=============================");
			
			System.out.println("선택>> ");
			String choice = scanner.nextLine();
			
			if(choice.equals("1")) {
				System.out.println("예금액>> ");
				int yegm = scanner.nextInt();
				bank += yegm;
			}
			else if(choice.equals("2")) {
				System.out.println("출금액>> ");
				int chulgm = scanner.nextInt();
				bank -= chulgm;	
			}			
			else if(choice.equals("3")) {
				System.out.println("잔고>> " + bank);	
			}
			else if(choice.equals("4")) {
				System.out.println("종료");
				start=false;
				break;
			}
			
			
		}

	}

}
