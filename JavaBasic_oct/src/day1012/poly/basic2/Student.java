package day1012.poly.basic2;

public class Student extends Person{
	
	String studentId; //학번
	
	Student(String name, int age, String studentId){
		super(name, age);
		this.studentId = studentId;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}

}
