package day1014.inter.basic;

public class Main {
	
	public static void main(String[] args) {
		
		//인터페이스는 객체생성이 불가능!!
		//Inter1 i1 = new Inter1();
		
		//interface도 부모type이 될 수 있다.
		//Inter1 b = new Basic();로 사용가능하다.
		//단 여러 interface를 상속하는 경우 Iter1의 method만 사용가능.
		
		///////////////////////////////////////////////////
		Basic b = new Basic();
		b.method01();
		b.method02();
		
		//(class 형변환)
		Inter2 i2 = b;
		i2.method02(); //method2번만 사용가능 
		
		Basic bb = (Basic)i2;//클래스 형변환
		bb.method01();
		bb.method02();
		
		
		
		
	}

}
