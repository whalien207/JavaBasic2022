package day1013.abs.bad;

public class SeoulStore extends Store{

	//부모님에 있는 3개의 method를 반드시 오버라이딩 해야하는데, 깜빡한다면?
	public void apple() {
		System.out.println("서울의 사과는 3000원");
	}
	
	public void melon() {
		System.out.println("서울의 멜론은 50000원");
	}
}
