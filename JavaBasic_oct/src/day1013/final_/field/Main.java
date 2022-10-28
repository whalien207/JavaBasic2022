package day1013.final_.field;

public class Main {
	
	public static void main(String[] args) {
		
		Person jo = new Person("111111-2222222", "ebjo");
		
		/*final 값의 변경 금지
		jo.nation = "아메리카";
		jo.ssn = "213123112";
		*/
		Person o = new Person("333333-4444444", "오");
		
		System.out.println(jo.ssn);
		System.out.println(o.ssn);
		
		//////////////////상수의 사용
		System.out.println(Constant.PI);
		System.out.println(Math.PI);
	}

}
