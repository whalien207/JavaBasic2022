package day1007.this_;

public class Teacher extends Person{
	
	String subject; // 과목

	Teacher(String name, int age, String subject){
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 과목:" + subject;
	}
}
