package day0921;
/**
 * 9/21
 * 연산에서의 형변환
 */

public class CastingEx03 {
	
	public static void main(String[] args) {
		
		//연산에서의 형변환
		char c = 'C'; //67
		int i = 2;

		//()먼저 계산뒤에 (char)로 캐스팅
		//1. 서로 다른 타입의 연산에서는 큰타입을 따라갑니다. (첫번째 법칙)
		char cc = (char)(c + i);
		int ii = c + i;
		
		System.out.println("cc:" + cc );
		System.out.println("ii:" + ii);
		
		//실수와 만나면 무조건 실수가 된다.
		int j = 10;
		double d = 3.14;
		double result = j + d;
		
		System.out.println("result:" + result);
		
		//2. int형 보다 작은 타입의 연산의 결과는 int가 됩니다.
		byte b1 = 100;
		byte b2 = 10;
		//byte로 저장하고 싶다면 캐스팅해야한다. byte b3 = (byte)(b1 + b2);
		int b3 = b1 + b2;
		
		System.out.println("b3:" + b3);
		
		short s1 = 100;
		byte s2 = 10;
		//캐스팅 short s3 = (short)(s1 + s2);
		int s3 = s1 + s2;
		
		System.out.println("s3:" + s3);
	}
}
