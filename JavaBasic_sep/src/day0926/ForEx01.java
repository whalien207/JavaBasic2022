package day0926;

public class ForEx01 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		//1~10합계
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("-------------------------------------------------");
		
		for(int i = 10; 1 <= i; i--) {
			System.out.println(i);
		}
	}

}
