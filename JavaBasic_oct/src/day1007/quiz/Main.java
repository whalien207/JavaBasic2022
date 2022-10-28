package day1007.quiz;

public class Main {
	/* 요구사항
	 * 부모 Calculator 선언하세요.
	 * 자식 Computer클래스 생성 합니다.
	 *
	 * Calculator 클래스
	 * Calculator의 멤버변수 int result, double pi를 선언하세요
	 * 
	 * Calculator의 메서드
	 * add(int) - result에 값을 누적시키는 기능
	 * circle(int) - pi를 이용해서 원의 넓이를 리턴하는 기능  (원의넓이: PI * r * r)
	 * ------------------------------------------------------------------
	 * Computer 클래스의 메서드
	 * circle() - 메서드를 오버라이딩 하고, pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요.
	 * rect(double) - 정사각형의 넓이 를 리턴
	 * rect(double, double) - 직사각형의 넓이 를 리턴
	 * rect(double, double, double) - 직육면체의 넓이 를 리턴
	 * 
	 * 
	 * 메인클래스에서 Calculator, Computer를 생성하고 메서드를 확인하세요.
	 */
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator(0, 0);
		cal.add(10);
		System.out.println("calculator class의 원의 넓이는 "+cal.circle(4));
		
		Computer com = new Computer();
		
		System.out.printf("원의 넓이는 %.2f \n", com.circle(4));
		System.out.println("정사각형의 넓이는 "+ (int)com.rect(14));
		System.out.println("직사각형의 넓이는 "+ com.rect(14, 23));
		System.out.println("직육면체의 넓이는 "+ com.rect(12,14,28));
		
		com.add(12);
		com.add(12);
		com.add(128);
	}

}
