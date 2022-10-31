package day0928;

import java.util.Scanner;

public class ArraySearch01 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		/* 배열을 다루는 방법. */

		// 탐색 -> 순차탐색(순서대로), 이진탐색(중간값부터 비교)
		int[] arr = {30, 10, 20, 50, 40, 60, 100, 110, 90, 80};
		
		//입력받은 값의 위치를 출력
		int find = scan.nextInt();
		
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == find) { //찾은경우
				index = i; //인덱스 값을 수정
				break; //탈출
			}
		}
		System.out.println("인덱스위치:" + index);
		
		scan.close();
	}

}
