package day1005;

public class PenMain {
	
	public static void main(String[] args) {
		
		//펜의 기능을 사용할 때는 객체로 생성하고, 참조연산자 . 을 사용한다. 
		Pen green = new Pen();
		green.color = "초록";
		green.price = 2000;
		green.company = "모나미";

		green.write();
		green.info();
		
		Pen blue = new Pen();
		blue.color = "파랑";
		blue.price = 2500;
		blue.company = "uni ball";

		blue.write();
		blue.info();
		
		/* calculator도 class로 만들어놨기 때문에 어디에서든 사용가능하다 */
		Calculator cal = new Calculator();
		cal.add(green.price);
		cal.print();
		//System.out.println(cal.add(100));
		
		cal.add(blue.price);
		cal.print();
	}

}
