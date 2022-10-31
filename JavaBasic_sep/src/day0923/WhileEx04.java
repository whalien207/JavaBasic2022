package day0923;

import java.util.Scanner;

public class WhileEx04 {
	
	public static void main(String[] args) {
		
		//정수를 입력받는다.
		//입력받은 정수까지의 합.
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int i = 1;
		int sum = 0;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println(num + "까지의 합: "+sum);
		scan.close();
	}

}
