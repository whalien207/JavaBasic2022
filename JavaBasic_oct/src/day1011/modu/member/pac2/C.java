package day1011.modu.member.pac2;

import day1011.modu.member.pac1.A;

public class C {
	
	public C() {
		A a = new A();
		a.var1 = 1;
		//a.var2 = 2;
		//a.var3 = 3; // private라 사용불가능
		
		a.method01();
		//a.method02();
		//a.method03(); // private라 사용불가능 
	}

}
