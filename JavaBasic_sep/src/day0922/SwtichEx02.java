package day0922;

import java.util.Scanner;

public class SwtichEx02 {
	public static void main(String[] args) {
		
		//IfEx02와 동일하게 실행되도록 
		//switch문으로 변경.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int point = scan.nextInt();
		String grade = null;
		
		switch (point/10) {
		case 9:
			if(point >= 95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
			break;
		case 8:
			grade = "B";
		break;
		case 7:
			grade = "C";
		break;
		case 6:
			grade = "D";
		break;

		default:
			grade = "F";
			break;
		}
		
		System.out.println(grade);
		scan.close();
	}

}
