package day1011.encap.bad;

public class Main {
	
	public static void main(String[] args) {
		
		//public으로 변수를 선언시, 잘못된 값이 저장될 수 있다.
		MyBirth me = new MyBirth();
		me.year = 2023;
		me.month = 13;
		me.day = 32;
		me.ssn = "아무값";
		
		me.info();
	}

}
