package day1005;

public class VariableMain {
	
	public static void main(String[] args) {
		
		Variable var = new Variable(); // 생성
		
		var.printNum(1000);
		System.out.println();
		
		var.a = "바꿈!";
		var.printNum(1000);
	}

}
