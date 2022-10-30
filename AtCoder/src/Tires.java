import java.util.Scanner;

public class Tires {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		String er = input.substring(input.length() < 2 ? 0 : input.length()-2, input.length());
		String ist = input.substring(input.length() < 3 ? 0 :input.length()-3, input.length());
		
		
		if(er.equals("er")) {
			System.out.println("er");
		}else if(ist.equals("ist")) {
			System.out.println("ist");
		}
		
		scan.close();
	}

}
