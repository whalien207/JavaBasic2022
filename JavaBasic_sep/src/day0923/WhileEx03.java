package day0923;

public class WhileEx03 {
	
	public static void main(String[] args) {
		
		//3의 배수의 개수 구하기
		//1~100까지의 정수중
		
		int i = 1;
		int count = 0; //개수 체크 변수
		
		while (i <= 100) {
			
			if(i % 3 == 0) { //i는 3의 배수다.
				count++;
			}
			
			i++;
		}
		System.out.println("3의 배수 개수는: " + count);
		
	}

}
