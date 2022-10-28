package day1005;

public class Variable {
	
	//멤버변수 : 초기화를 하지 않으면 기본값으로 자동 초기화
	String a;
	
	//c는 매개변수 (Parameter)
	void printNum(int c) {
		int b = 10; // 지역변수는 초기값이 지정되어야 사용가능
		System.out.println("멤버: "+ a);
		System.out.println("지역: "+ b);
		System.out.println("매개: "+ c);
	}

}
