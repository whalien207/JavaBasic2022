import java.util.Scanner;

public class Slimes {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		/*
		 * long type으로 안해줬더니 통과를 못했다.
		 */
		long A = Integer.parseInt(input.split(" ")[0]);
		long B = Integer.parseInt(input.split(" ")[1]);
		long K = Integer.parseInt(input.split(" ")[2]);
		
		long count = 0;
		for(long i = A; i < B; i*=K) {
			count++;
		}

		System.out.println(count);
		scan.close();
	}

}
