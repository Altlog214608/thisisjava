package thisisjava.src.ch04.example;
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

			if(choice.equals("")){
				System.out.println("빈 값");
			}

			if(choice.equals("1")) {
				System.out.println("예금액>> ");
				int sendmoney = Integer.parseInt(scanner.nextLine());
				bank += sendmoney;


			}
			else if(choice.equals("2")) {
				System.out.println("출금액>> ");
				int outmoney = Integer.parseInt(scanner.nextLine());
				if (outmoney > bank){
					System.out.println("출금액이 잔고보다 많습니다");

					continue;
				}
				bank -= outmoney;
				scanner.reset();

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
