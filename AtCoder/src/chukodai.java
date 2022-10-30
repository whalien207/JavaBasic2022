import java.util.Scanner;

public class chukodai {
	
	/* 츄코다이 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input>");
		String input = scan.nextLine();
		String input2 = scan.nextLine();
		
		int index1 = Integer.parseInt(input2.split(" ")[0])-1;
		int index2 = Integer.parseInt(input2.split(" ")[1])-1;
		
		char[] arr = input.toCharArray();
		char tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
		
		String result = "";
		for(char c : arr) {
			result += c;
		}
		
		/*
		char c1 = input.charAt(index1);
		char c2 = input.charAt(index2);
		
		String result = input.substring(0, index1);
		result += c2;
		result += input.substring(index1+1, index2);
		result += c1;
		result += input.substring(index2+1, input.length());
		 */
		System.out.println(result);
		
		
		scan.close();
	}

}
