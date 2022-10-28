package day1013.static_.var;

public class Main {
	
	public static void main(String[] args) {
		
		Count c1 = new Count ();
		c1.a++;
		c1.b++;
		
		System.out.println("일반변수:" + c1.a);
		System.out.println("정적변수:" + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("일반변수:" + c2.a);
		System.out.println("정적변수:" + c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("일반변수:" + c3.a);
		System.out.println("정적변수:" + c3.b);
		
		/*
		 * 일반변수는 객체마다 새로운 변수로 인식.
		 * static 변수는 객체마다 호출하면 하나의 객체로 값이 누적된다.
		 * c1 / c2 / c3의 일반변수는 다른 변수로 인식하여 a의 값은 1이지만
		 * b는 static변수로 누적되어 3이된다.
		 */
		
		//static변수 특징 2번째
		//객체 생성없이 바로 접근 가능하다. class이름을 활용하여
		Count.b++;
		Count.b++;
		Count.b++;
		
		System.out.println(Count.b);
		
	}

}
