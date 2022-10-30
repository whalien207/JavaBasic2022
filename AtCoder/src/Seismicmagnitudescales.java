import java.util.Scanner;

public class Seismicmagnitudescales {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int B = scan.nextInt();
		
		int result = (int)Math.pow(32, A-B);
		System.out.println(result);
		
		scan.close();
	}

}
