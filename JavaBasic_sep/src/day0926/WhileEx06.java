package day0926;

public class WhileEx06 {
	
	public static void main(String[] args) {
		
		// 배열과 반복문
		//시작은 0 ~ 길이미만
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//배열의 값 출력 = arr[인덱스]
		int i = 0; //배열의 시작 index
		int sum = 0; //누적값을 구하기 위한 변수
		
		while(i < arr.length) {
			
			//System.out.println(i); 0...9까지 출력 index값임.
			System.out.println(arr[i]);
			sum += arr[i]; //배열 안의 값들의 누적값 계산.
			
			i++;
		}
		System.out.println("누적값: " + sum);
		
	}

}
