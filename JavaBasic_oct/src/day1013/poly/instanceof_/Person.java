package day1013.poly.instanceof_;

public class Person { //부모 클래스 사용
	
	String name;
	int age;
	
	Person(String name){ 
		this(name, 1);
	}
	
	Person(String name, int age){
		this.name = name.toUpperCase();
		this.age = age;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}

}
