import java.util.Scanner;

public class GoodMorning {
	
	/* 좋은 아침 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("input>");
		String input = scan.nextLine();
		
		int A = Integer.parseInt(input.split(" ")[0]);
		int B = Integer.parseInt(input.split(" ")[1]);
		int C = Integer.parseInt(input.split(" ")[2]);
		int D = Integer.parseInt(input.split(" ")[3]);
		
		//시간비교
		if(A < C) { //숫자가 작을수록 더일찍 일어난것.
			System.out.println("Takahashi");
		}else if(C < A) {
			System.out.println("Aoki");
		}else {
			//시간이 같은 경우 분 비교
			if(D < B) {
				System.out.println("Aoki");
			}else { // 동시간일때 무조건 아오키가 늦게 일어남
				System.out.println("Takahashi");
			}
		}
		scan.close();
	}
}
