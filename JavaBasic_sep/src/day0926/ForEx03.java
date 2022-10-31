package day0926;

import java.util.Arrays;

public class ForEx03 {
	
	public static void main(String[] args) {
		
		//for문으로 배열의 사용.
		/*
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		*/
		
		//100개의 크기를 갖는 int 배열에 3의 배수만 순서대로 저장.
		int[] arr = new int[100];
		int a = 0;
		for(int i = 0; i < arr.length; i++) {
			a +=3;
			arr[i] = a; 
		}
		System.out.println(Arrays.toString(arr));

	}
}
