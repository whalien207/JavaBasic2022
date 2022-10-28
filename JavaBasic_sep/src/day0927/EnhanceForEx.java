package day0927;

public class EnhanceForEx {
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		//일반 for문으로 실행
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//향상된 for문으로 실행
		//for(받을 변수 타입과 변수이름 : 배열이름)
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("----------------------");
		
		String[] sArr = {"월", "화", "수", "목", "금"};
		for(String s : sArr) {
			System.out.println(s);
		}
		
		System.out.println("----------------------");
		
		//배열 요소들의 합계와 평균을 소수 2자리 까지만 출력
		int[] score = {34, 54, 23, 53, 65};
		double sum = 0;
		for(int num : score) {
			sum += num;
		}
		
		System.out.printf("합계: %.2f\n", sum);
		System.out.printf("평균: %.2f\n", sum/score.length);
		System.out.println("합계: "+ String.format("%.2f",  sum));
		System.out.println("평균: "+ String.format("%.2f",  sum/score.length));
		
	}

}
