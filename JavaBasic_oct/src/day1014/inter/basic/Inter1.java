package day1014.inter.basic;

public interface Inter1 {
	
	/*
	 * interface는 객체생성이 불가하다.
	 * 상수, 추상method +@  (default method, static method)
	 * 주로 상수와 추상 method를 사용한다.
	 */
	
	//interface안의 변수는 전부 public 상수가 된다. (=무조건 초기값을 지정해주어야 한다)
	double PI = 3.14;
	
	//interface안의 method는 abstract 즉, 기본으로 public 추상method가 된다.
	void method01();
	
}
