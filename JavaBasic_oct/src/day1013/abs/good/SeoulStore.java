package day1013.abs.good;

public class SeoulStore extends Store{

	/*
	 * error 해결방법 
	 * 1. 자식 class를 abstract class로 만들어 준다
	 * 2. method를 오버라이딩 해준다.
	 */
	
	@Override
	public void apple() {
		System.out.println("서울지점 사과는 3000원");
	}

	@Override
	public void melon() {
		System.out.println("서울지점 멜론 50000원");
	}

	@Override
	public void orange() {
		System.out.println("서울지점 오렌지는 5000원");
	}


}
