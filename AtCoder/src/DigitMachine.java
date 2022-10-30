import java.util.Scanner;

public class DigitMachine {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		input = input.replace(" ", "");

		int index = 0;
		for(int i = 0; i < 3; i++) {
			index = input.charAt(index)-'0';
		}
		System.out.println(index);
		scan.close();
	}

}
