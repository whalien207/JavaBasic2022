import java.util.Scanner;

public class QQsolver {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		int a = input.charAt(0) - '0';
		int b = input.charAt(2) - '0';
		
		System.out.println(a*b);
		
		scan.close();
		
	}

}
