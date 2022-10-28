package day1007.ovrride2;

//extends로 상속을 받아 person의 자식으로 만든다
public class Employee extends Person{

	String department; // 부서
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
	
}
