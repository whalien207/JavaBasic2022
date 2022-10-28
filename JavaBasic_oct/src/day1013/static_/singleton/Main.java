package day1013.static_.singleton;

public class Main {
	
	public static void main(String[] args) {
		/*
		System.out.println(Computer.a);
		System.out.println(Computer.a);
		System.out.println(Computer.a);
		System.out.println(Computer.a);
		*/
		
		//Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
		
		System.out.println(s == s2);
		System.out.println(s2 == s3);
		
		/*
		 * singleton 디자인을 통해 클래스 객체를 여러번 생성해도 전부 하나로 실체는 같기 때문에
		 * 각 객체의 site변수를 호출해도 다 똑같다.
		 */
		s.site = "이순신";
		System.out.println(s2.site);
		System.out.println(s3.site);
	}

}
