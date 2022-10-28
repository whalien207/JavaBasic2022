package day0928;

public class ContinueEx01 {
	
	public static void main(String[] args) {
		
		/*for문으로 continue*/
		/*
		for(int i = 1; i <= 10; i++) {
			
			if(i % 2 == 1) { //홀수
				continue;//다음 반복으로 pass
			}
			System.out.println(i);
		}
		*/
		
		int i = 0;
		while(i <= 10) {
			
			i++; // while문 같은 경우 무한루프를 돌기 쉽기 때문제 순서에 주의 해야 한다.
			if(i % 2 == 1) {
				//return; // 종료 
				continue;
			}
			
			System.out.println(i);
		}
		System.out.println("프로그램 정상 종료");
		
	}

}
