package day1011.super_;

public class MainClass {
	public static void main(String[] args) {

		Mother m = new Mother();
		System.out.println(m.info());

		
		Employee e = new Employee("이순식", 20, "역사");
		System.out.println(e.info());
		
	}

}
