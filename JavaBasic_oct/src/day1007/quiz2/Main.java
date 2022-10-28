package day1007.quiz2;

import java.util.Arrays;

public class Main {
	/*
	Arrays.toString() 의 기능을 따라하기


	PrintArray클래스
	1. toArray() - int[]을 매개변수로 입력받아 배열의 모형을 문자열로 리턴하는 메서드
	2. toArray() - 1번과 내용은 같고, char[]을 받도록 overloading
	2. toArray() - 1번과 내용은 같고, String[]을 받도록 overloading
	*/
	public static void main(String[] args) {
		
		PrintArray print = new PrintArray();
		
		int[] i_arr = {1, 2, 3, 4, 5, 6};
		System.out.println("==== int 배열 toString() ====");
		System.out.println(print.toArray(i_arr));
		//System.out.println(Arrays.toString(i_arr));
		
		char[] c_arr = {'h','e','l','l','o'};
		System.out.println("==== char 배열 toString() ====");
		System.out.println(print.toArray(c_arr));
		//System.out.println(Arrays.toString(c_arr));
		
		String[] s_arr = {"hello", "봉쥬르", "니하오", "안녕"};
		System.out.println("==== String 배열 toString() ====");
		System.out.println(print.toArray(s_arr));
		System.out.println(Arrays.toString(s_arr));
	}

}
