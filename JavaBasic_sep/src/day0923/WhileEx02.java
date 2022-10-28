package day0923;

public class WhileEx02 {
	
	public static void main(String[] args) {
		
		//100번 회전하는 반복문에서 짝수만 출력 1
		int i = 1;
		while(i <= 100) {
			if(i%2 ==0) {
				System.out.print(i + " ");				
			}
			i++;
		}
		System.out.println();//줄바꿈 역할
		
		//100번 회전하는 반복문에서 짝수만 출력 2
		int j = 2;
		while(j<=100) {
			System.out.print(j+" ");
			j += 2;
		}
		
	}

}
