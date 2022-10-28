package day1013.static_.method;

public class Main {
	
	public static void main(String[] args) {
		
		Count c = new Count();
		c.some1(); //일반
		c.some2(); //static
		
		Count.some2();
		
		//main은 static이기 때문에
		a(); // 그냥 사용 가능.
	}
	
	public static void a() {
		
	}

}
