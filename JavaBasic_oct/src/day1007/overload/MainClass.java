package day1007.overload;

public class MainClass {
	
	public static void main(String[] args) {
		
		Basic b = new Basic();
		
		b.input(1);
		b.input("홍길동");
		b.input("a", 1);
		b.input(3, "b");
		b.input(100, 100, 1);
		
		//int배열, double배열, string배열
		//Arrays.toString();
	}

}
