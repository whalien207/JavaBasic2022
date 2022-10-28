package day1007.override;

public class Child extends Parent{
	
	//overring된 method
	
	int method02() {
		System.out.println("자식의 overring 된 2번 method");
		return 100;
	}
	
	
	//child의 method
	void method03() {
		System.out.println("자식의 3번 method");
	}
}
