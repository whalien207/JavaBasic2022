package day1024day1025;

//자료형의 이름을 임시로 만들어두고 내부에서 임시로 만든 자료형을 사용한 후 
//인스턴스를 생성할 때 자료형을 결정하는 방식을 이용
//단 인스턴스를 만들 때 또는 method를 호출할 때 실제 자료형을 기재해야 한다.
//이 때 사용되는 자료형은 Object로 부터 상속받은 클래스의 자료형만 가능하다.
//int와 같은 primitive type의 경우는 Integer와 같은 Wrapper 클래스를 이용해야 한다.
//미지정 자료형의 개수는 제한이 없다.
//인스턴스를 만들 때 자료형을 설정핮 않으면 경고가 발생한다.

class Generics <T>{
	private T [] data;
	//...은 variable args로 개수에 상관없이 매개변수를 받고자 할 때 사용
	// 받은 매개변수들은 배열로 만들어 집니다.
	public Generics(T ... n) {
		this.data = n;
	}
	
	public void display() {
		for(T temp : data) {
			System.out.println(temp);
		}
	}
}

public class TemplateProgramming {

	public static void main(String[] args) {
		//Generic이 적용된 클래스의 인스턴스를 만들 때는 자료형을 기재해야 한다.
		//자료형을 기재하지 않으면 경고가 발생하고 Object타입으로 간주한다.
		/*
		Algorithm <Integer> algo = new Algorithm();
		Integer n1 = 20;
		Integer n2 = 30;
		algo.add(n1, n2);
		System.out.println(n1);
		System.out.println(n2);
		*/
		
		Generics <String> g1 = new Generics<String>("Karina", "Suzi", "IU");
		g1.display();
		Generics <Integer> g2 = new Generics<>(100, 300, 200, 400);
		g2.display();
	}
}
