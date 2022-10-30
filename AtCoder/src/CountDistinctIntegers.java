import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CountDistinctIntegers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		String str = scan.nextLine();
		String[] arr = str.split(" ");
		
		HashSet<String> set = new HashSet<>(Arrays.asList(arr));
		String[] result = set.toArray(new String[0]);
		
		System.out.println(result.length);
		
		scan.close();
	}

}
