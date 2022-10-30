import java.util.Scanner;

public class Rounddecimals {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float input = scan.nextFloat();
		
		System.out.println(Math.round(input));
		scan.close();
	}

}
