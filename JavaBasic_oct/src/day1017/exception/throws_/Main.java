package day1017.exception.throws_;

public class Main {
	
	public static void main(String[] args) throws Exception{
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
	}

}
