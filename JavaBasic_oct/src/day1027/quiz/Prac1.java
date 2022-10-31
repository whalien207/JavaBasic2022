package day1027.quiz;

public class Prac1 {
	
	public static void main(String[] args) {
		
		/* *박스만들기 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		/* *직각 삼각형 만들기 */
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		/* *거꾸로 삼각형 만들기*/
		for(int i = 5; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		
	}

}
