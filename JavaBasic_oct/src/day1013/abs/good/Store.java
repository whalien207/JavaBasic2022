package day1013.abs.good;

/* abstract method는 일반 class에 사용불가능 abstract class에만 사용 가능하다. */
public abstract class Store {
	
	/*
	 * 1. method에 abstract를 붙이면 추상 method가 된다. ( {}가 없는 method )
	 * 2. 추상method를 사용하고 싶다면, 추상 class가 되어야 한다.
	 * 
	 */
	
	//추상메서드
	public abstract void apple();
	public abstract void melon();
	public abstract void orange();

	/* 멤버변수, 생성자, 일반메서드 전부 사용가능하다. */

	//멤버변수
	private String name = "호식이네";
	
	//생성자
	public Store() {
		System.out.println("추상클래스 생성자 호출");
	}
	
	//일반method (getter, setter)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
