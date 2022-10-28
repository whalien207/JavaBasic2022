package day0921;
/**
 * 9/21
 * 연산자 - 2항/비교
 */

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//2항 연산자 - 항이 2개인 연산자
		int i = 7 / 3; //몫 2
		int j = 7 % 3; // 나머지 1
		int k = 7 * 3; // 곱 21
		
		//비교연산
		System.out.println(i == j); //f
		System.out.println(i != j); //t
		System.out.println(i >= 1); //t
		System.out.println(i < j); //f
		System.out.println(k != 21); //f
		
		//2의 배수 즉 홀수 짝수 배수 구분할때 많이 사용하는 구문~
		System.out.println(k % 2 != 0); //t
		System.out.println(k % 2 == 0); //f
		System.out.println(k % 7 == 0); //t->7의 배수
		
		
	}
}
