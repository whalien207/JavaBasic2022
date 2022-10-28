package day1007.quiz;

public class Calculator {
	
	int result;
	double pi;
	
	Calculator(){
		//default
	}
	
	Calculator(int pResult, double pPi){
		result = pResult;
		pi = pPi;
	}
	
	//result에 받은 값을 누적
	int add(int num) {
		result += num;
		System.out.println("누적값: " + result);
		return result;
	}
	
	//pi를 이용해서 원의 넓이를 리턴
	double circle(int r) {
		return pi * r * r;
	}

}
