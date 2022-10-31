package day0921;
/**
 * 9/21
 */

public class OperatorEx04 {
	public static void main(String[] args) {
		
		int a = 6;
		int b = 5;
		
		a +=3; // a = a + 3;과 동일한 표현
		b =+ 3; // b = +3;임 주의 연산자 반대로 적으면 안됨.
		System.out.println(a);
		
		a -= 4; //5
		a *= 10; //50
		a /= 3; //16
		a %= 4; //0
		System.out.println(a);
	}
}
