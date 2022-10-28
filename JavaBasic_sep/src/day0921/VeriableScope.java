package day0921;
/**
 * 9/21
 */

public class VeriableScope {

	public static void main(String[] args) {
		
		//아래와 같은 방법으로 변수를 선언할 수도 있다.
		//int num1 = 10, num2 = 20;
		int num1 = 10;
		int num2 = 20;
		
		int num4 = 0; // 초기화

		//변수는 해당 중괄호 안에서만 사용할 수 있습니다.
		//main안에서 만들어진 변수를 지역변수라고 부른다.
		if(true) {
			int num3 = num1 + num2;
			System.out.println(num3);
			
			num4 = 200;//변경가능
		}
		//num3이 if구문 안에서 선언되어있기 떄문에 구문안에서만 사용가능하다.
		//System.out.println(num3);
		
		//num3이 if구문안에서 사용되었다 사라졌기 때문에 {}밖에서 다시 선언하여 사용가능하다.
		int num3 = 100;
		System.out.println(num3);
		
		System.out.println(num4);
	}
}
