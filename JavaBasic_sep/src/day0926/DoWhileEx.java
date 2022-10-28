package day0926;

public class DoWhileEx {
	public static void main(String[] args) {
		
		//while문이 do~while 대체 할 수 있어서 많이 사용하지 X
		
		/*
		int sum = 0;
		int i = 1;
		while(i <= 10) {//배열이 아닌경우에는 <='이하'로 하는 것이 편하다.
			
			sum += i;
			
			i++;
		}
		System.out.println(sum);
		*/
		
		/* 위에 내용을 do-while로 바꿔보았다. */
		//do~while 문은 조건이 거짓이라도 무조건 한번 실행한다.
		int i = 1;
		int sum = 0;
		do {
			sum += i;
			i++;
		}while(i <= 10);
		
		System.out.println(sum);
	}

}
