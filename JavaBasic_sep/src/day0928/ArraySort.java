package day0928;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		//정렬
		// 선택정렬 (기본, 제일 쉬움)
		int[] arr = {5, 23, 1, 43, 100, 200, 40};
		
		//퀵소트(퀵정렬) - 제일빠른 정렬 중 하나이다.
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length-1; i++) {//순서대로 배열안의 숫자들
			
			for(int j = i+1; j < arr.length; j++) {//비교하는 다음배열안의 숫자들
				
				if(arr[j] < arr[i]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
