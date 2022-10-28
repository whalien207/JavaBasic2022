package day1004;

public class MethodEx03 {

	public static void main(String[] args) {

		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 매서드가 돌려주는 값에 대한 타입.
		 * 2. 반환유형이 있는 메서드는 호출 구문이 값이 도기 때문에 메서드의 매개값으로 사용될 수 있다.
		 * ex) println(메서드 호출)
		 * 3. 모든 메서드는 return을 강제종료 됩니다.
		 * 4. 리턴문 아래에는 코드를 작성할 수 없습니다. (작성해도 실행안됨)
		 */
		int result = add(3,5);
		System.out.println("결과" + result);

		//아래와 같이 사용도 가능하다.
		//앞부터 1+2 = 3 & 2+3=5
		//3+5 = 8
		add(add(1,2), add(2,3));
		
		//반환값이 없기 때문에 아래처럼 변수에 값을 받을 수는 없다.
		//int r = sub(1,2);
		//이런식으로 호출만 가능하다.
		sub(1,2);
		
		noReturn("hello");
		
	}
	// 반환 O, 매개변수 O (return O, parameter O)
	static int add(int a, int b) {
		return a+b;
	}
	
	//반환 X, 매개변수 O (return X, parameter O) - 리턴이 없음(단순실행)
	static void sub(int a ,int b) {
		System.out.println("a-b=" + (a-b));
	}
	
	//void형에서 return - 종료
	static void noReturn(String s) {
		if(s.equals("hello")) {
			System.out.println("실행종료");
			return;//종료
		}
		System.out.println(s);
	}

}
