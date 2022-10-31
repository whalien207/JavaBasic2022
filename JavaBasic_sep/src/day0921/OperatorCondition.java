package day0921;

public class OperatorCondition {

	public static void main(String[] args) {
		//프로그램에서 랜덤한 값은 유효한 의미를 가집니다.
		//System.out.println(Math.random()); //0이상~1.0미만 랜덤값 출력
		//유효한 정수 랜덤값 1~10
		int num = (int)(Math.random() * 10) + 1; //1~10까지
		System.out.println(num);
		
		//랜덤값이 3의 배수인지 아닌지를 검사
		String result = num % 3 == 0 ? "3의 배수" : "3의 배수가 아님.";
		System.out.println(result);
		
		System.out.println("------------------------");
		
		/*
		 * 1~100까지 랜덤한 정수를 생성
		 * 짝수 or 홀수 인지 결과를 출력
		 */
		
		int ran_num = (int)(Math.random() * 100) + 1; //1~100까지
		System.out.println(ran_num);
		
		String sniffling = ran_num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(sniffling);
		
		System.out.println("------------------------");
		
		/*
		 * -5~5까지 랜덤한 정수를 생성 (0~10)-10
		 * 어떤 정수가 나오든 절대값으로 출력하세요. (양의 정수로)
		 */
		
		int num2 = (int)(Math.random() * 11) - 5;
		System.out.println(Math.abs(num2));
		System.out.println( num2 > 0 ? num2 : -num2) ;
				
	}
}
