package day1005;

public class Calculator {
	//요것이 클래스 바로 '틀' 이다.
	int result;
	int add(int n) {
		result += n;
		return result;
	}
	
	void print() {
		System.out.println(result);
	}
}
