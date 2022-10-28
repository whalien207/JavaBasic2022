package day1017.exception.trycatch;

import java.util.Scanner;

public class TryCatchEx03 {

	public static void main(String[] args) {
		
		//입력과 예외처리
		//0을 입력하기 전까지 숫자를 입력.
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.print(">");
				int num = Integer.parseInt(scan.nextLine()); //정수를 받음 2번 해결방법
				//BufferReader bf = new BufferedReader(new InputStreamReder(System.in, "utf-9"));

				//1번 해결방법 : int num = scan.nextInt(); //정수를 받음
				if(num == 0) break;
				
			} catch (Exception e) {
				System.out.println("정수를 입력해줘");
				//1번 해결방법 : scan.nextLine();
				//continue;
			}
			
		}
		
	}
}
