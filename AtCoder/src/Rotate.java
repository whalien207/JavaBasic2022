import java.util.Scanner;

public class Rotate {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		int c = input % 10;
		input /= 10;
		int b = input % 10;
		input /= 10;
		int a = input;
		
		int abc = (a*100)+(b*10)+c;
		int bca = (b*100)+(c*10)+a;
		int cab = (c*100)+(a*10)+b;
		
		int result = abc+bca+cab;
		System.out.println(result);
		scan.close();
	}

}
