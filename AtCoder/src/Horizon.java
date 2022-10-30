import java.util.Scanner;

public class Horizon {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input>");
		double input = scan.nextDouble();
		
		double result = Math.sqrt(input*(12800000+input));
		
		System.out.printf("%.9f",result);
		
		scan.close();
	}

}
