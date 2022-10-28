package day1017.exception.trycatch;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * up down게임
		 * 
		 * 1~100까지의 임의 숫자를 1번 생성
		 * 반복문안에서 스캐너를 이용해서 정답을 입력 받습니다.
		 * 
		 * 랜덤수가 입력받은 값보다 작으면 "더 큰 수를 입력하세요"
		 * 랜덤수가 입력받은 값보다 크면 "더 작은 수를 입력하세요"
		 * 
		 * 정답이라면 시도횟수: x회 를 출력하고 종료
		 * 
		 * 만약에 숫자가 아닌값이 들어온다면 예외처리를 하고 다시 입력받으세요
		 */
		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random() * 100);
		int count = 0;
		
		while(true) {
			try {
				
				System.out.print(">");
				int input = Integer.parseInt(scan.nextLine());
				count ++;
 				
				if(random == input) {
					System.out.println("정답입니다.");
					System.out.println("시도 횟수: "+count);
					break;
				}else if (random < input) {
					System.out.println("더 작은 수를 입력하세요");
					
				}else {
					System.out.println("더 큰 수를 입력하세요");
				}
				
			}catch (NumberFormatException e) {
				System.out.println("숫자가 아닌값입니다. 숫자를 입력하세요.");
				count ++;
			}catch (Exception e) {
				System.out.println("기타 예외");
				count ++;
			}
		}
		
	}
}
