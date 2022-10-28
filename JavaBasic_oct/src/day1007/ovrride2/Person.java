package day1007.ovrride2;

public class Person { //부모 클래스 사용
	
	//employee , student, teacher에 중복되는 부분을 person부모 클래스에 정의했다.
	String name;
	int age;
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}

}
