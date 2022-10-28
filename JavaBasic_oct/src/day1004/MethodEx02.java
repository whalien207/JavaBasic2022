package day1004;

public class MethodEx02 {
	
	public static void main(String[] args) {
		
		/*
		 * 매개변수(parameter)
		 * 1. 매개변수는 메서드를 호출할 때 필요한 값을 전달하는 매개체.
		 * 2. 매게변수는 몇 개 반들지 메서드를 선언할 때 결정해줍니다.
		 */
		
		/*
		int sum = 0;
		int end = 10;
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		*/
		
		/*메서드를 사용한다면 매번 다른 값을 사용하여 결과값을 뽑아내기 수월하다*/
		int result = calSum(10);
		System.out.println("1~10까지 합:" + result);
		
		int result2 = calSum(100);
		System.out.println("1~100까지 합:" + result2);
		
		int result3 = calSum2(10, 20);
		System.out.println("10~20까지 합:" + result3);
		
	}
	
	//반환 O, 매개변수 O (return O, parameter O)
	static int calSum(int end) {
		int sum = 0;
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
	
	//반환 O, 매개변수 O (return O, parameter O) - 매개변수가 여러개
	static int calSum2(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}

}
