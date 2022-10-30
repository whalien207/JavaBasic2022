import java.util.Scanner;

public class FourDigits {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String digit = scan.nextLine();
		
		if(digit.length() == 4) {
			System.out.println(digit);
		}else if(digit.length() == 3) {
			System.out.println("0"+digit);
		}else if(digit.length() == 2) {
			System.out.println("00"+digit);
		}else if(digit.length() == 1) {
			System.out.println("000"+digit);
		}
		scan.close();
	}

}
