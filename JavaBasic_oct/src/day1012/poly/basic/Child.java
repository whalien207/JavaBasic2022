package day1012.poly.basic;

public class Child extends Parent{

	//alt+shift+s Override Implement method

	@Override
	public void method02() {
		System.out.println("오버라이드 된 2번 method");
	}
	
	public void method03() {
		System.out.println("자식의 3번 method");
	}
}
