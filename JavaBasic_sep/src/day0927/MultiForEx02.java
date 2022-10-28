package day0927;

public class MultiForEx02 {

	public static void main(String[] args) {

		//회전할때마다 횟수가 변하는 중첩반복문
		/*
		 *     *   
		 *    ***
		 *   ******
		 *  ********
		 * **********
		 */

		int star = 5;//변수를 쓰는 이유 중 하나.
		//변수 값만 바꾸면 규칙에 맞게 출력값이 한번에 변함.

		for(int i = 1; i <= star; i++) {

			//공백
			for(int k = 1; k <= star-i; k++) {
				System.out.print(" ");
			}

			//별
			for(int j = 1; j <= i*2-1; j++) {
				//1일때 2바퀴,2일때 4바퀴 이런식으로 조건이 달라지는 반복문에 초점을 둔다.
				System.out.print("*");
			}

			System.out.println();
		}

		/*
		 * 뒤집은 피라미드.
		 * ex) 5열
		 * i - 공백j - 별j
		 * 1 -  0   -  9
		 * 2 -  1   -  7
		 * 3 -  2   -  5
		 * 4 -  3   -  3
		 * 5 -  4   -  1
		 *
		 * 규칙이 뭘까? 
		 * (열-i)*2+1
		 * 
		 */
		
		System.out.println("---------------");
		for(int i = 1; i <= star; i++) {//star(열)만큼 for문

			for(int k = 1; k < i; k++) { // 공백찍기. 2번째 줄부터 공백나오도록..
			//for(int k = 1; k <= i-1; K++) 강사님의 코드
				System.out.print(" ");
			}

			for (int j = 1; j <= 2*(star-i)+1; j++)//(열-i)*2+1 조건으로 계속 한개씩 별찍기.
			{
				System.out.print("*");
			}
			System.out.println();
		}



	}

}
