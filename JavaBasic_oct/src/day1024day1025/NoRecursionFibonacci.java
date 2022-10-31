package day1024day1025;

public class NoRecursionFibonacci {
	
	public static int fibonacci(int n) {
		int f1 = 1;
		int f2 = 1;
		
		int fibo = 1;
		
		for(int i = 3; i <= n; i++) {
			fibo = f1 + f2;
			f1 = f2;
			f2 = fibo;
		}
		return fibo;
	}
	
	public static void main(String[] args) {
		System.out.println(fibonacci(10));
	}

}
