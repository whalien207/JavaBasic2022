package day1012.poly.basic;

//하나의 파일에 여러개 class 선언이 가능하다. 
//단, 파일명과 동일한 클래스가 public이어야 한다. (나머지는 default class)
//java는 1파일에 1class가 원칙이다.
class A{}
class B extends A{}
class C extends A{}
class D extends B{}
class E extends C{}

public class Basic { // 사용자 클래스
	
	//다형성(클래스형변환) - 자식의 주소가 부모에 저장되는 성질
	//멤버변수
	
	A a = new B();
	A a1 = new C();
	A a2 = new D();
	A a3 = new E();
	
	//상속관계를 가져야만 다형성이 인정된다.
	//B b = new C();
	
	//Object 형에는 모든 클래스를 저장할 수 있습니다.
	Object obj = 1;
	Object obj1 = 3.14;
	Object obj2 = "문자열";
	Object obj3 = new A();
	
	

}
