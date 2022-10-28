package day1011.modi.protec.pac1;

public class B {

	public B() {
		A a = new A();
		a.s = "홍길동"; // 동일패키지 접근가능
		a.method();
		
	}
}
