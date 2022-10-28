package day1005;

import java.util.Arrays;

public class MethodEx04 {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		String[] arr2 = {"월","화","수"};
		
		method01(arr);
		method02(arr, arr2);
		
		int[] arr3 = method03();
		String[] arr4 = "strstr".split("");
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
	}
	
	// 정수배열을 매개변수로 받는 메서드
	static void method01(int[] a) {
		//a를 이용해서 배열값의 사용가능
		System.out.println(Arrays.toString(a));
	}
	//정수배열과, 문자열 배열을 매개변수로 받는 메서드
	static int method02(int[] arr, String[] arr2) {
		for(int a : arr) {
			System.out.println(a);
		}
		return 0;
	}
	//배열을 반환하는 메서드
	static int[] method03() {
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		return arr;
	}

}
