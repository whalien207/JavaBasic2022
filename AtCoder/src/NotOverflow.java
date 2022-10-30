import java.util.Scanner;

public class NotOverflow {
	
	/* 오버플로우 내지않기 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input>");
		double num = scan.nextDouble();
		
		if(Math.pow(-2, 31) <= num && num <= Math.pow(2, 31)-1) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		
		scan.close();
		
	}

}
