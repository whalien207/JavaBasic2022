package day1013.abs.good;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 1. 추상 class는 객체 생성이 안된다.
		 * 즉, Store s = new Store(); 안됨.
		 * 반드시 자식으로 구체화 해야한다.
		 */
		
		//아래 모형을 class 추상화 부모 객체에 자식을 받기.
		//Store gangnam = new SeoulStore(); 부모 객체로 받아도 결과는 같다.
		
		Store gangnam = new BusanStore();
		//부모 class에서 abstract로 생성된 method, 자식에서 overriding된 기능으로 사용가능.
		gangnam.apple();
		gangnam.melon();
		gangnam.orange();
		
		//상속받은 부모의 method 사용 가능.
		System.out.println(gangnam.getName());
		
		

	}

}
