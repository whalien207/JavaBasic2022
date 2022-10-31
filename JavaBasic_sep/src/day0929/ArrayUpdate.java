package day0929;

import java.util.Scanner;

public class ArrayUpdate {
	
	public static void main(String[] args) {
		
		//배열값의 수정
		//탐색 -> 변경 -> 결과출력
		
		Scanner scan = new Scanner(System.in);
		
		String[] arr = {"어피치", "라이언", "제이지", "네오", "무지", "튜브"};
		
		System.out.print("찾을 이름>");
		String name = scan.next();
		
		boolean flag = false; // 
		for(int i = 0; i < arr.length; i++) {
			if(name.equals(arr[i])) { //같은 값이 있다면

				System.out.print("바꿔줄 이름>");
				String n = scan.next();
				arr[i] = n; //수정
				flag = true;
				
			}
		}
		
		if(flag) {
			System.out.println("별명이 수정되었습니다.");
		}else {
			System.out.println("별명이 존재하지 않습니다.");
		}
		
		scan.close();
	}

}
