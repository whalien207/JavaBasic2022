package day1014.inter.default_;

public class Main {
	
	public static void main(String[] args) {
		
		MyClass m = new MyClass();
		m.some1();//오버라이딩 된 메서드.
		m.some2();
		
		MyInter.some3();//static method
		System.out.println(MyInter.PI);//상수
	}

}
