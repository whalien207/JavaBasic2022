package day0921;

public class OperatorEx03 {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		//if 뒤에는 조건이 온다. true라면 if문 실행 false라면 else문 실행.
		//&&, ||는 앞항을 검사해서 결과가 정해지면, 뒤를 실행하지 않는다.
		if(x != 10 && ++y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다.");
		}
		
		System.out.println("x:" + x + " y:" + y);

		if(x == 10 || ++y == 21) {
			System.out.println("참 입니다.");
		} else {
			System.out.println("거짓 입니다");
		}
		
		System.out.println("x:" + x + " y:" + y);
		
	}
}
