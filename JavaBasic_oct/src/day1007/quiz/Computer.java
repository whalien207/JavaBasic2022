package day1007.quiz;

public class Computer extends Calculator{
	
	Computer(){
		//default
	}
	
	Computer(int pResult, double pPi){
		result = pResult;
		pi = pPi;
	}
	
	//pi대신 하는 Math.PI를 사용해서 원의 넓이를 구하세요
	double circle(int r){
		return Math.PI * r * r;
	}
	
	/* rect는 overloading */
	//정사각형 넓이
	double rect(double length) {
		return length * length;
	}
	
	//직사각형 넓이
	double rect(double depth, double width) {
		return depth * width;
	}
	
	//직육면체의 넓이 
	double rect(double depth, double width, double height) {
		return depth * width * height;
	}


}
