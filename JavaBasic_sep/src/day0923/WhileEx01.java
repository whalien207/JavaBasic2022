package day0923;

public class WhileEx01 {
	public static void main(String[] args) {
		
		int a = 1; // 제어 변수 : 반복문의 횟수를 결정할 변수

		while(a <= 10) {
			System.out.println("hello" + a);
			a++; // 제어변수 조작을 통해 반복의 조건식이 언젠가 false되도록 처리.
		}
		
		//누적
		int i =1;
		int sum = 0; // 누적할 변수

		while(i <= 10) {
			
			sum += i;
			
			i++;
		}
		System.out.println("1~10까지 sum: "+sum);
		
	}

}
