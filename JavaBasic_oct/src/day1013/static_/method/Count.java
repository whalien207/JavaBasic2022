package day1013.static_.method;

public class Count {
	
	public int a;
	public static int b;
	
	//일반method - 일반변수, 정적변수 둘다 사용가능
	public int some1() {
		a = 10;
		return ++b; 
	}
	
	//정적method - 정적변수만 사용가능(단, 객체생성을 통해서 사용가능하다)
	public static int some2() {
		//a = 10;// 일반변수를 그냥 사용은 불가능. (클래스 객체 생성 필요함)
		Count c = new Count();
		c.a = 10;
		
		return ++b; // b는 static 변수라서 사용 가능
	}
}
