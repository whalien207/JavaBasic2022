package day0921;
/**
 * 9/21
 * byte, short, int, long 각각의 저장가능한 숫자
 */

public class TypeInteger {
	
	public static void main(String[] args) {
//정수형 실습
		//byte, short, int, long 각각의 저장가능한 숫자
		//byte a = 128; 127까지 저장가능하다.
		byte b = -128; // byte -128~127까지 저장가능
		
		short c = 32767;//32768은 안되고 32767까지 가능하다
		short d = -32768;
		
		int e = 2147483647;
		int f = -2147483648;
		
		long g = 123123123123123123L;
		//long은 숫자뒤에 L을 붙여서 long타입임을 명시해주어야 에러가 안뜸.
		System.out.println(g);
		
		/*
		 * 2진수로 저장할때에는 0b를 붙임
		 * 8진수로 저장할때에는 0을 붙임
		 * 16진수로 저장할때에는 0x를 붙임
		 */
		
		int bin = 0b1010; // 2진수
		int octa = 064; // 8진수
		int hexa = 0xAC00; //16진수

		//java는 문자열과 변수를 같이 출력하고 싶을 때 그냥 +를 사용하면된다.
		System.out.println("2진수 1010은:" + bin + "입니다");
		System.out.println("8진수 64은:" + octa + "입니다");
		System.out.println("16진수 AC00은:" + hexa + "입니다");
		
		System.out.println("----------------------------------");
// 실수형 실습
		float f1 = 3.14F; // float을 표기할 때에는 f를 붙여준다.(기본형이 double이므로)
		double d1 = 3.14;
		
		float f2 = 3.1415923333F; // 7자리까지 유효
		double d2 = 3.1415923333; // 15자리까지 유효
		
		System.out.println(f2);
		System.out.println(d2);
		
		System.out.println("----------------------------------");
		//e표기법(구경만)
		//자리가 부족한 경우 실수부와 정수부의 크기를 조절해 줄수 있는 표기법
		float f3 = 314.15e-2F; // 10 -2승
		double d3 = 0.031415e2; //10의 2승
		
		System.out.println(f3);
		System.out.println(d3);
		
		System.out.println("----------------------------------");
//논리형 실습
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
		System.out.println(bool2);
	}
}
