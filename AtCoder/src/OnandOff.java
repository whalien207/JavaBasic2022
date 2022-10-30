import java.util.Scanner;

public class OnandOff {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int S = scan.nextInt();
		int T = scan.nextInt();
		int X = scan.nextInt();

		if(S > T && T < 24) {
			if(S <= X || X < T) {
				System.out.println("Yes");
				return;
			}
		}

		if(S <= X && X < T) { // S시 이상 T 미만.
			System.out.println("Yes");
			return;
		}

		System.out.println("No");


		scan.close();
	}

}
