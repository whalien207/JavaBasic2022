import java.util.Scanner;

public class LackedNumber {
	
	/* 부족한 숫자 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input > ");
		String input = scan.nextLine();
		
		//로직 처리...
		char[] arr = input.toCharArray();
		int sum = 0;
		for(char c : arr) {
			sum += c -'0';
		}
		System.out.print("결과값 = " + (45 - sum));
		
		scan.close();
	}
	
}
