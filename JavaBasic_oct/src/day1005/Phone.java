package day1005;

public class Phone {
	
	String model;
	int price;
	String color;
	
	/*
	 * 생성자
	 * 1. 클래스가 객체로 처음 생성될 떄 불려나가는 친구
	 * 2. 이름은 클래스 명과 동일하다.
	 * 3. 생성자를 만들지 않으면 자동으로 생성해 줍니다. 
	 */
	Phone(){ //**기본생성자 제일 많이 사용된다.**  && 멤버 변수의 모두 받아서 초기화하는것도 많이 사용됨.
		System.out.println("생성자 호출됨");
		//생성자의 주된 역할은 멤버변수 초기화 
		model = "iphone8";
		price = 380000;
		color = "pinkgold";
		
	}
	
	//()가 있기때문에 parameter값을 받을 수도 있다.
	Phone(String pModel){//생성자는 여러개 만들수 있다, 단 모형이 달라야 한다.
		model = pModel;
		price = 580000;
		color = "blue";
	}
	
	//생성자 중복 - consturtor overloading이라고 한다.
	Phone(String pModel, int pPrice){
		model = pModel;
		price = pPrice;
		color = "purple";
	}
	
	//자바는 data type을 중시하기 때문에 parameter값을 서로 바꿔서 사용하면 또하나의 생성자로 사용가능하다.
	Phone(int pPrice, String pModel){
		model = pModel;
		price = pPrice;
		color = "silver";
	}
	
	Phone(String pModel, int pPrice, String pColor){
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	void info() {
		System.out.println("===폰의 정보===");
		System.out.println("모델no: " + model);
		System.out.println("가격: " + price);
		System.out.println("색상: " + color);
	}

}
