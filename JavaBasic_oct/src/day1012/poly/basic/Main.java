package day1012.poly.basic;

public class Main {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01();//child에 없기때문에 부모의 method01
		c.method02();//child에 있는 method02 ( 오버라이드 되었있음 )
		c.method03();//child에 있는 method03
		
		System.out.println("-----다형성-----");
		/*
		 * 자식이 부모에 저장되는데, 부모님처럼 사용되지만
		 * 단, 자식의 오버라이딩된 메서드가 실행된다.
		 */
		Parent p = c;
		p.method01(); //Perent class에 있는 method밖에 사용할 수 없다
		p.method02(); //but, 오버라이드된 것은 우선적으로 사용하게 된다.(자식의 method02번 사용)
		
		System.out.println(p == c); // 동일한 주소값을 나타냄.
		
		
		System.out.println("------클래스 캐스팅------");
		/*
		 * 다형성이 적용되면, 자식이 가지고 있던 본래의 기능을 사용할 수 없기 때문에.
		 * 클래스 캐스팅을 사용합니다.
		 */
		
		Child cc = (Child)p;
		
		cc.method01();
		cc.method02();
		cc.method03();
		
		System.out.println("-----주의 할 점-----");
		/* 다형성이 적용된 객체만 캐스팅이 가능합니다 */
		Parent pp = new Parent();
		Child ccc = (Child)pp; //error;
	}

}
