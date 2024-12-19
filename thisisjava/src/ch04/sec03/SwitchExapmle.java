package ch04.sec03;

public class SwitchExapmle {

	public static void main(String[] args) {
		int num = (int)(Math.random()*6) +1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다ㅣ");
			break;
		case 2:
			System.out.println("2번이 나왔습니다ㅣ");
			break;
		case 3:
			System.out.println("3번이 나왔습니다ㅣ");
			break;
		case 4:
			System.out.println("4번이 나왔습니다ㅣ");
			break;
		case 5:
			System.out.println("5번이 나왔습니다ㅣ");
			break;
		case 6:
			System.out.println("6번이 나왔습니다ㅣ");
			break;
		
		//주사위 2개 던져서 두 주사위의 숫자가 같게 나오면 두 수의 합을 출력
		//같지 않으면 각 주사위 숫자를 출력한다.
		}
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		int result = 0;
		result = dice1 + dice2;
		if (dice1 == dice2) {
			System.out.println("두 주사위의 수가 같은 경우의 합 :"+ result);
		} else {
			System.out.println("첫번째 주사위:"+dice1);
			System.out.println("두번째 주사위:"+dice2);
		}
		
		boolean x = (dice1==dice2);
		String xx = String.valueOf(x);
		
		
		switch(dice1 - dice2) {
		case 0:
			System.out.println(dice1+dice2);
			break;
		default:
			System.out.println(dice1);
			System.out.println(dice2);
	
		}
		
		switch(xx) {
		case "true":
			System.out.println(dice1+dice2);
			break;
		default:
			System.out.println(dice1);
			System.out.println(dice2);
			
		}
		
		int time = (int)(Math.random()*4) +8;
		System.out.println("[현재 시간 : "+ time + "시]");
		
		switch(time) {
		case 8:
			System.out.println("출근합니다.");
		case 9:
			System.out.println("회의를 합니다.");
		case 10:
			System.out.println("업무를 봅니다.");
		default:
			System.out.println("외근을 나갑니다.");
		}
		
		String grade = "B";
		
		int score1 =  0;
		switch (grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result2 = 100 -20;
				score1 = result2;
				break;
			default:
				score1 = 60;
		}	
		System.out.println("score1:"+ score1);
		
		String grade2 = "B";
		int score2 = switch(grade2) {
			case "A" -> 100;
			case "B" -> {
				int result2 = 100-20;
				yield result2;
			}
			default -> 60;
		};
		// yield 키워드: 값의 반환
		// -> 표현 switch 표현식
		// case B에 {}로 묶은 이유? 여러 실행문이 들어가니까.
		System.out.println("score2:" + score2);
		
		for(int i = 0, j =100; i<=50 && j >=50; i++,j--) {
			//초기화식 2개 증감식 2개 조건 2개 작성
			// 내부적으로 i,j 두 값 사용 가능
		}
		
		int aa;
		//1번 구역
		for(aa=1;aa<=100;aa++) {
			//2번구역
		}
		//3번구역
		
		
	}
}


