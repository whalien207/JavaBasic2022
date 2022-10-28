package day1012.poly.basic2;

import javax.print.attribute.standard.PrinterInfo;

public class MainClass {

	public static void main(String[] args) {
		
		//다형성을 적용한 배열
		Student s = new Student("홍길동", 20, "123123");
		
		Teacher t = new Teacher("홍길자", 30, "프로그램");
		
		Employee e = new Employee("홍길순", 40, "취업지원팀");
		
		//Object[] arr = {s, t, e};
		Person[] arr = {s, t, e};

		for(Person p : arr) {
			System.out.println(p.info()); // 오버라이딩 된 method실행.
		}
		
		//method에 static을 붙이지 않고 실행할 수 있는 방법
		//MainClass m = new MainClass();
		//m.printInfo(s);
		
		System.out.println("===========");
		printInfo(s);
		printInfo(t);
		printInfo(e);
		
		System.out.println();
		System.out.println("====== 4. 3명의 person 전달 =====");
		House h = new House();
		h.setPerson(s);
		h.setPerson(t);
		h.setPerson(e);  
		
		h.printArrayPerson();
		
		Person[] ar = h.getArr();
		for(Person p : ar) {
			if(p == null) break;
			System.out.println(p.info());
		}
	}
	
	public static void printInfo(Person p) {
		System.out.println(p.info());
	}
	

}
