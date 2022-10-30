import java.util.Scanner;

public class Jogging2 {
	
	/* 조깅 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("input> ");
		String input = scan.nextLine();
		int A = Integer.parseInt(input.split(" ")[0]);
		int B = Integer.parseInt(input.split(" ")[1]);
		int C = Integer.parseInt(input.split(" ")[2]);
		int D = Integer.parseInt(input.split(" ")[3]);
		int E = Integer.parseInt(input.split(" ")[4]);
		int F = Integer.parseInt(input.split(" ")[5]);
		int X = Integer.parseInt(input.split(" ")[6]);
		
		int t_move = 0;
		if(X < A+C) {
			t_move = ((A+C) / X)*A;
			t_move += (A+C) % X;
		} else {
			t_move = (X / (A+C))*A;
			t_move += X % (A+C);
		}
		
		int a_move = 0;
		if( X < D+F) {
			a_move = ((D+F) / X)*D;
			a_move += (D+F) % X;
		} else {
			a_move = (X / (D+F))*D;
			a_move += X % (D+F);
		}
		
		//결과적으로 초당 이동할 수 있는 M를 계산하여 비교해주기.
		int result_T = t_move * B;
		int result_A = a_move * E;
		
		if(result_T < result_A) {
			System.out.println("Aoki");
		}else if(result_A < result_T) {
			System.out.println("Takahashi");
		}else {
			System.out.println("Draw");
		}
		
		scan.close();
	}

}
