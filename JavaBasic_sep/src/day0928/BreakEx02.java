package day0928;

import java.util.Scanner;

public class BreakEx02 {
	
	public static void main(String[] args) {

		/*
		 * '무한루프'의 개념
		 * - 무한정 돌아가는 반복문.
		 * ex)키오스크를 생각해보면 멈추지 않는 동작.
		 * - 반복의 횟수를 정확히 가늠할 수 없을 때 무한루프를 만들고 Break문으로 빠져나오도록 처리.
		 */
		
		//정답을 맞출때까지 정답을 입력받는 프로그램.

		Scanner scan = new Scanner(System.in);
		
		while(true) {//계속 돌아가는
			System.out.println("4 X 6 = ?");
			System.out.print(">");
			
			int answer = scan.nextInt();
			
			//24면 탈출
			if(answer == 24) {
				System.out.println("정답!");
				break;
			}
			
			System.out.println("정답아니야!");
		}
		System.out.println("프로그램을 종료합니다");
		scan.close();
	}

}
