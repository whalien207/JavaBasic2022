package day0929;

import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {

		//배열의 한계점 - 크기가 고정
		//입력받은 문자열을 배열에 순서대로 저장.
		Scanner scan = new Scanner(System.in);
		String[] arr = new String[100];

		int count = 0; //인덱스를 나태내는 변수 

		//"그만" 문자가 들어오기 전까지 입력
		while(true) {
			//next 공백을 기준으로 인식
			//nextLine 엔터를 기준으로 인식 
			//	- 문제: nextInt와 같은 애들이랑 사용을 못함.
			System.out.print(">"); 
			String menu = scan.nextLine();

			if(menu.equals("그만")) {
				break;
			}
			arr[count] = menu; // 저장
			count ++; // 인덱스 증가
		}
		//전체 배열을 출력해보면 값이 들어가지 않은 칸들은 null이 출력되기 때문에..
		//System.out.println(Arrays.toString(arr));
		//for문으로 값을 입력한 곳 까지만 출력해준다.
		String str = "[";
		for(int i = 0; i< count; i++) {
			str += arr[i];

			if(i == count-1) {//마지막 문자열
				str += "]";
				break;
			}
			str += ", ";
		}
		System.out.println(str);

		scan.close();
	}

}
