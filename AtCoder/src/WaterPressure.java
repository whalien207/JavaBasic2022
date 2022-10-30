import java.util.Scanner;

public class WaterPressure {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double D = scan.nextDouble();
		
		System.out.println(D/100);
		
		scan.close();
	}

}
