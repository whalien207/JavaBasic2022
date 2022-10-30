import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctStrings {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		char[] arr = input.toCharArray();
		System.out.println(Arrays.toString(arr));
		
		String[] string_combination = new String[input.length()*2];
		int str_index = 0;
		for(int i = 0; i < arr.length; i++) {
			String index = "012";
			index = index.replace(Integer.toString(i), "");
			int one = index.charAt(0) - '0';
			int two = index.charAt(1) - '0';
			
			string_combination[str_index++] = arr[i]+""+arr[one]+""+arr[two]; 
			string_combination[str_index++] = arr[i]+""+arr[two]+""+arr[one]; 
		}

		//HashSet을 사용하여 중복 배열 제거 후 갯수 세기.
		HashSet<String> hashSet = new HashSet<>(Arrays.asList(string_combination));
		String[] resultArr = hashSet.toArray(new String[0]);
		System.out.println(resultArr.length);
		
		scan.close();
	}

}
