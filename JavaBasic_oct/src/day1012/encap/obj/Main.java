package day1012.encap.obj;

public class Main {
	
	public static void main(String[] args) {
		
		//호텔클래스 사용
		Hotel budapest = new Hotel();
		
		//방법1
		budapest.setChef(new Chef());
		
		/*방법2
		Chef chef = new Chef();
		budapest.setChef(chef);
		*/
		
		Chef emp_chef = budapest.getChef();
		
		emp_chef.cooking();
		
	}

}
