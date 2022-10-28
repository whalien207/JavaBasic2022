package day1011.modi.protec.pac2;

import day1011.modi.protec.pac1.*;
public class C extends A{
	
	public C() {
		//public 제외 같은 클래스, 같은 패키지에서만 접근 가능.
		//A a = new A();
		
		//패키지가 다르더라도, super키워드를 통한 접근은 가능
		super();
		super.s = "홍길동";
		super.method();
	}

}
