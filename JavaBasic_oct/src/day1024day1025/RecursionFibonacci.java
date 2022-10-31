package day1024day1025;

public class RecursionFibonacci {
	
	//n번쨰 피보나치 수열의 값을 리턴해 주는 method
	public static int fibonacci(int n) {
		//시작 1,2번째는 1
		if(n == 1 || n == 2) {
			return 1;
		}
		//세번째 부터는 앞 두개의 합
		else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}

}
