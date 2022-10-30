import java.util.Scanner;

public class ExactPrice {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		
		if( 100 <= X && X % 100 == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scan.close();
	}

}
