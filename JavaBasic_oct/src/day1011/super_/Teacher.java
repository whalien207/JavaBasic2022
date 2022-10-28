package day1011.super_;

public class Teacher extends Person{
	
	String subject; // 과목

	Teacher(String name, int age, String subject){
		super(name, age);
		this.subject = subject;
	}
	
	String info() {
		return super.info() + ", 과목:" + subject;
		//super.메서드() - 오버라이딩된 메서드에서 부모님의 원형베서드가 필요할 때 사용가능
		//아래에 return을 위처럼 super로 부모 클래스의 메서드를 받아와서 사용할 수도 있다.
		//return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
}
