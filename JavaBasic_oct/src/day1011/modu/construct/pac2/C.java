package day1011.modu.construct.pac2;

import day1011.modu.construct.pac1.A;

public class C {

	A a = new A(10); // public이니까 접근가능
	//A b = new A(true); //default라 불가능(다른 패키지)
	//A c = new A("접근제어자"); // private는 불가능 (자기자신에서만 사용가능)

}
