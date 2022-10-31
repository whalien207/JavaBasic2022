package day0929;

import java.util.Scanner;

public class ArrayDelete {
	
	public static void main(String[] args) {
		
		//배열에서 삭제 개념은 없습니다.
		
		/* int 배열 delete 작업 */
		/*
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		// 만약 5의 값을 삭제한다 라는 작업을 한다면 0으로 바꾸고 0을 출력을 안한다는가...
		// 뒤쪽에 있는 값들을 앞쪽으로 당겨오는 작업을 해준다.
		
		
		//4번째 인덱스에 있는 값을 삭제 하는 작업 예시
		for(int i = 4; i < arr.length-1 ; i++) {
			arr[i] = arr[i+1];
		}
		
		//[1,2,3,4,6,7,8,9,10,10]으로 변경된다. 
		System.out.println(Arrays.toString(arr));
		*/
		
		/* String배열 delete 작업 */
		Scanner scan = new Scanner(System.in);
		
		String[] arr = {"어피치", "라이언", "제이지", "네오", "무지", "튜브"};
		
		System.out.print("삭제할 이름>");
		String name = scan.next();
		
		int count = arr.length; //삭제가 일어났을 때 하나씩 감소.
		
		for(int i = 0; i < count; i++) {
			
			if(name.equals(arr[i])) {//이름값이 같다면 삭제 작업
				for(int j = i; j < count-1; j++) {
					arr[j] = arr[j+1]; // 찾은 위치에서 뒤 원소를 당김.
				}
				count --;
			}
		}
		
		//아래와 같이 출력하여 삭제된것 처럼 보여지게 할 수 있다. 사실은 제일 마지막 값은 중복으로 남아있음.
		String str = "[";
		for(int i = 0; i < count; i++) {
			str += arr[i];
			if(i == count - 1) {
				str+="]";
				break;
			}
			str += ", ";
		}
		
		System.out.println(str);
		scan.close();
	}

}
