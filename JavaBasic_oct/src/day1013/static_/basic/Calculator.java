package day1013.static_.basic;

public class Calculator { // 사용자 클래스
	
	//계산기 마다 다른값을 지닌다면 일반변수
	private String model; 
	private int result;
	
	//계산기마다 똑같은 값이라면 정적변수
	public static double pi = 3.14;

	//private 변수들에 대한 getter, setter 생성
	//일반멤버변수를 사용하는 메서드는 static이면 안된다.
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	/*
	 * 일반변수를 사용하지 않고, 범용성 있게 사용할 method는 static을 붙이면 좋다.
	 */
	public static double circle (int r) {
		return Math.PI * r * r;
	}
	

}
