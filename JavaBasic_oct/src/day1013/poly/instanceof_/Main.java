package day1013.poly.instanceof_;

public class Main {
	
	public static void main(String[] args) {
		
		//instanceof - 객체의 모형을 확인
		
		Person s = new Student("홍길동", 10, "1234");
		Person t = new Teacher("김컴", 10, "프로그램");
		
	}
	
	public static void casting(Person p) {
		if(p instanceof Student) {
			//p가 Student면 true, 아니면 false
			Student s = (Student)p;
			System.out.println(s.info());
		} else if(p instanceof Teacher) {
			Teacher t = (Teacher)p;
			System.out.println(t.info());
		}
	}

}
