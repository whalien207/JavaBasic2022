package day1024day1025;

import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// 실수 문자열을 입력받아서 실수로 변경하고 출력하는 program
		System.out.print("실수를 입력>");
		String su = scan.nextLine();
		
		try {
			//실수 문자열을 실수로 변경
			Double silsu = Double.parseDouble(su);
			
			//실수를 문자열로 변환
			String msg = silsu.toString();
			System.out.println(msg);
		}catch (Exception e) {
			System.out.println("변환에 실패");
		}
		
		scan.close();
	}

}
