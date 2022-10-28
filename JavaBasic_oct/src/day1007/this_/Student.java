package day1007.this_;

public class Student extends Person{
	
	String studentId; //학번
	
	//this 키워드를 이용해서 
	Student(String name, int age, String studentId){
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 학번:" + studentId;
	}

}
