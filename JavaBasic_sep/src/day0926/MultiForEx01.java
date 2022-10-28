package day0926;

public class MultiForEx01 {
	
	public static void main(String[] args) {
		
		//1~9
		for(int i = 1; i <= 9; i++) {
			System.out.println(i);
			//중첩반복문의 사용
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "-" + j);
			}
			System.out.println("---------");
		}
		
		
	}

}
