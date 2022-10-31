package day0928;

import java.util.Scanner;

public class ArraySearch02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//순차탐색과 문자열 비교
		/* 순차 탐색*/
		String[] arr = {"홍길동","이순신","카카오","네이버","박찬호"};

		String name = scan.next();
		
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(name.equals(arr[i])) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {//값이 없음.
			System.out.println(name + "은 없습니다.");
		}else {
			System.out.println(name + "는(은) " + index + "번째에 위치합니다.");
		}
		
	
		
		scan.close();
	}

}
