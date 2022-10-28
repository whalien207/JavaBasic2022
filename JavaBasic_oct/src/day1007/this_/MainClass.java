package day1007.this_;

public class MainClass {
	public static void main(String[] args) {

		Person p = new Person(); // 부모클래스
		System.out.println(p.info());
		
		Person p1 = new Person("hoggilJa");
		System.out.println(p1.info());
		
		Person p2 = new Person("gildongHong", 20);
		System.out.println(p2.info());
		
		Teacher t = new Teacher("선생님", 43, "국어");
		System.out.println(t.info());

	}

}
