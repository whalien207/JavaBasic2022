import java.util.Arrays;
import java.util.Scanner;

public class MinimizeOrdering {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		char[] arr = input.toCharArray();
		Arrays.sort(arr);

		System.out.println(String.valueOf(arr));
		
		scan.close();
	}

}
