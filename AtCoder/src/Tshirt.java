import java.util.Scanner;

public class Tshirt {

	/* 티셔츠 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("input>");
		String input = scan.nextLine();
		
		double A = Integer.parseInt(input.split(" ")[0]);
		double B = Integer.parseInt(input.split(" ")[1]);
		double C = Integer.parseInt(input.split(" ")[2]);
		int X = Integer.parseInt(input.split(" ")[3]);
		
		double percent = 0;
		
		if (X <= A) { // 이로하가 100%받는 순위에 드는경우
			percent = 1;
		}else if(B < X){ // 이로하가 랜덤으로 받는 순위에도 들지 못한 경우
			percent = 0;
		}else { // 랜덤에 들어가는 경우
			percent = C / (B-A);
		}
		
		System.out.println(percent);
		
		scan.close();

	}

}
