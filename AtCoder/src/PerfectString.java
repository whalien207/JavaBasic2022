import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PerfectString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		boolean upper = false;
		boolean lower = false;
		for(int i = 0; i < input.length(); i++) {
			//대문자 있음
			if(Character.isUpperCase(input.charAt(i))==true) {
				upper = true;
			}
			//소문자 있음
			if(Character.isLowerCase(input.charAt(i))==true) {
				lower = true;
			}
		}
		
		boolean overlap = false;
		for(int i = 0; i < input.length(); i++) {
			if(i != input.indexOf(input.charAt(i))) {//중복 문자 있음
				overlap = true;
			}
		}

		if(upper && lower) { // 둘다 있다면 중복문자 있으면 안됨.
			System.out.println("소문자 대문자 둘다있음");
			if(!overlap) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
		
		scan.close();
		
	}

}
