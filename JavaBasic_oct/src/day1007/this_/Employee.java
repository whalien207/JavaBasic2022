package day1007.this_;

//extends로 상속을 받아 person의 자식으로 만든다
public class Employee extends Person{

	String department; // 부서
	
	Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
	
}
