import java.util.Scanner;

public class Jogging {
	
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
		
		int move_t = 0, move_a = 0;
		int rest_t = 0, rest_a = 0;
		
		//T가 x초에 얼마만큼 걸을 수 있는가 계산
		
		for(int s = 1; s <= X; s++) {
			if(0 < move_t && move_t % A == 0) {
				if(rest_t != C) {
					rest_t++;
					continue;
				}
				rest_t = 0;
			}
			move_t ++;
		}
				
		//A가 x초에 얼마만큼 걸을 수 있는가 계산
		
		for(int s = 1; s <= X; s++) {
			if(0 < move_a && move_a % D == 0) {
				if(rest_a != F) {
					rest_a++;
					continue;
				}
				rest_a = 0;
			}
			move_a ++;
		}
		
		//System.out.println("T 몇초간 움직였는가? "+ move_t);
		//System.out.println("A 몇초간 움직였는가? "+ move_a);
		
		//결과적으로 초당 이동할 수 있는 M를 계산하여 비교해주기.
		int result_T = move_t * B;
		int result_A = move_a * E;
		
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
