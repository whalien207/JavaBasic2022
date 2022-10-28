package day0928;

public class BreakEx01 {

	public static void main(String[] args) {

		/*
		int i = 1;
		while(i <= 10) {

			if(i == 5) break;

			//break문 밑에 출력문이 있기 때문에 4까지 출력.
			//위치 같은 것들에 주의해서 사용을 해야한다.
			System.out.println(i);


			if(i == 5) { 
				// break를 단독으로 사용하면 들어오자마자 나가게됨.
				// 조건을 같이 사용하는 경우가 많다.
				break;
			}


			i++;
		}
		 */
		
		/* 위에 while로 짠 break문을 for문으로 변환*/
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			if(i == 5) break;
		}


	}

}
