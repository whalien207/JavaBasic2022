import java.util.Scanner;

public class Shampoo {
	
	/* 샴푸 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input>");
		String input = scan.nextLine();
		
		int shampoo = Integer.parseInt(input.split(" ")[0]);
		int use_f = Integer.parseInt(input.split(" ")[1]);
		int use_m = Integer.parseInt(input.split(" ")[2]);
		int use_t = Integer.parseInt(input.split(" ")[3]);
		
		char last_use = ' ';
		while(true) {

			shampoo -= use_f;
			//System.out.println("f "+shampoo);
			if(shampoo < 0) {
				last_use = 'F';
				break;
			}
			
			shampoo -= use_m;
			//System.out.println("m "+shampoo);
			if(shampoo < 0) {
				last_use = 'M';
				break;
			}
			
			shampoo -= use_t;
			//System.out.println("t "+shampoo);
			if(shampoo < 0) {
				last_use = 'T';
				break;
			}
			
			
		}
		
		System.out.println("마지막으로 샴푸를 사용한 사람은? " + last_use);
		
		scan.close();
	}

}
