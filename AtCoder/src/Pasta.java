import java.util.Arrays;
import java.util.Scanner;

public class Pasta {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		int N = Integer.parseInt(num.split(" ")[0]);
		int M = Integer.parseInt(num.split(" ")[1]);
		String A = scan.nextLine();
		String B = scan.nextLine();
		
		String[] arr_a = A.split(" ");
		String[] arr_b = B.split(" ");
		
		boolean find_n = false;
		for(int i = 0; i < M; i++) {
			
			find_n = false;
			for(int j = 0; j < N; j++) {
				if(arr_b[i].equals(arr_a[j])){
					arr_a[j] = "0";
					find_n = true;
					break;
				}
			}
			
			if(!find_n) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		scan.close();
	}

}
