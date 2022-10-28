package day1014.inter.default_;

public interface MyInter {
	
	/*
	 * 상수, 추상, default, static
	 * 
	 */
	
	double PI = 3.14;
	
	void some1();
	
	//default method - interface에도 몸체를 가지는 method선언이 가능하다.
	default void some2() {
		System.out.println("default method 실행");
	}
	
	static void some3() {
		System.out.println("static method 실행");
	}

}
