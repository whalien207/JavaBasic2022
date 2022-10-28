package day1013.static_.singleton;

public class Singleton {

	//디자인패턴 - 클래스를 설계하는 기법
	//싱글톤패턴 - 객체를 1개만 생성되도록 설계하는 기법
	
	// 1. 나 자신의 객체를 멤버변수로 선언하고, 1개로 고정한다.
	// static이 없다면 무한loop에 빠짐 계속 나 자신의 객체를 불러오는 것이므로...
	// static 1번만 하겠다는 의미로 무한loop에 빠지지 않는다.
	private static Singleton instance = new Singleton();
	
	//2. 객체 생성을 못하도록 생성자를 private처리
	private Singleton() {}
	
	//3. s변수(나자신 객체)를 getter로 반환
	// static 키워드를 붙임
	public static Singleton getInstance() {
		return instance;
	}
	
	public String site = "aaa";
}
