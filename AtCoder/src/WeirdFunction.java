import java.util.Scanner;

public class WeirdFunction {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int result = f(f(f(t)+t)+f(f(t)));
		System.out.println(result);
		
		scan.close();
		
	}
	
	public static int f(int x) {
		return (x*x)+(2*x)+3;
	}

}
