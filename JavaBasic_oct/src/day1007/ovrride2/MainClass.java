package day1007.ovrride2;

public class MainClass {
	public static void main(String[] args) {

		Person p = new Person(); // 부모클래스
		p.age = 53;
		p.name = "부모님";
		System.out.println(p.info());
		
		Student s = new Student();
		s.age = 22;
		s.name = "학생";
		s.studentId = "2017113110";
		System.out.println(s.info());
		
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name = "선생님";
		t.subject = "역사";
		System.out.println(t.info());
		
		
	}

}
