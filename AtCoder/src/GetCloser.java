import java.util.Scanner;

public class GetCloser {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double A = scan.nextDouble();
		double B = scan.nextDouble();
		
		double angle = B/A;
		
		scan.close();
	}

}
