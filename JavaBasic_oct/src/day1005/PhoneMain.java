package day1005;

public class PhoneMain {
	
	public static void main(String[] args) {
		
		//객체1
		Phone apple = new Phone();
		apple.info();
		
		//객체2
		Phone samsung = new Phone("zFlip");
		samsung.info();
		
		//객체3
		Phone blackberry = new Phone("Q10", 300000);
		blackberry.info();
		
		//객체4
		Phone nokia = new Phone(250000, "Nokia2");
		nokia.info();
		
		// 모든 멤버 변수를 매개변수로 받는 생성자 만들기
		// 초록, 10000, 아이폰을 전달해서 객체 생성
		
		Phone iphone = new Phone("iphone", 10000, "초록");
		iphone.info();
	}

}
