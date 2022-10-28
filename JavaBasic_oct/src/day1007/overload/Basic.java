package day1007.overload;

public class Basic {
	
	/*
	 * 오버로딩 - 같은 이름의 method를 여러개 만드는 것
	 * 
	 * <규칙>
	 * 1. 반환유형 or 접근제어자는 영향을 미치지 않는다.
	 * 2. parameter type or 종류 or 순서 중 한개만 다르다면 ok~
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력");
	}
	
	//반환은 상관이 없기때문에 아래는 완전 똑같은 method로 인식된다.
	//int input(int a) {
	
	void input(String s) {
		System.out.println("문자열 1개 입력");
	}
	
	void input(String s, int a) {
		System.out.println("문자열 1개 입력, 정수 1개 입력");
	}
	
	//parameter 자리 바꾸기 허용.
	void input(int a, String s) {
		System.out.println("정수 1개 입력, 문자열 1개 입력");
	}
	
	void input(double a, double b, int c) {
		System.out.println("실수 2개, 정수 1개 입력");
	}
	

}
