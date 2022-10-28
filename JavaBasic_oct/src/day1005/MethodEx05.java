package day1005;

public class MethodEx05 {
	
	public static void main(String[] args) {
		
		// 메서드의 (동기적) 실행 방식
		// 동기적 - 순서대로 실행한다.
		
		test01();
		//메서드의 재귀적 실행 - 기초
		recursive(0);
		
		//메서드의 재귀적 실행 - factorial
		int sum = 1;
		for(int i = 1; i <= 5; i++) {
			sum *= i; // 팩토리얼~ (순서대로 곱해주기)
		}
		System.out.println(sum);
		
		//재귀적 함수 - 위 코드를 fac method로 만들 수 있다. (다만 효율은 좀 떨어지는,,,)
		int result = fac(5);
		System.out.println(result);
	}
	
	static void test01() {
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}
	
	static void test02(){
		System.out.println("2번 메서드 실행");
		System.out.println("2번 메서드 종료");
	}

	static void recursive (int a) {
		//재귀적 함수는 탈출의 구문을 반드시 명시해주는 것이 규칙이다.
		if(a == 10) return;
		
		a++;//param 값 증가
		recursive(a);
	}
	
	static int fac(int a) {
		if(a == 1) return 1;//fac(1) = 1
		
		return a * fac(a-1);
	}
}
