package day0928;

import java.util.Scanner;

public class ArraySearch03 {

	public static void main(String[] args) {

		/* 이진탐색 - 절반으로 나눠가며 찾아가는 과정 */
		//조건 - 순서대로 나열된 데이터

		int[] arr = {30, 50, 80, 100, 110, 250, 300, 500};

		Scanner scan = new Scanner(System.in);
		System.out.print("입력>");
		int num = scan.nextInt();
		
		//요 한줄짜리 코드가 밑에 구성한 이진탐색코드를 대체해준다.
		//System.out.println(Arrays.binarySearch(arr, num));

		int low = 0;
		int high = arr.length - 1; //7

		while(low <= high) {
			int mid = (low + high) / 2;

			if(num == arr[mid]) {
				System.out.println("인덱스 위치:" + mid);
				break;
			}

			if(num > arr[mid]) { //입력값이 중간값 보다 큰 경우
				low = mid+1;
			}else { //입력값이 중간값 보다 작은 경우
				high = mid-1;
			}
		}
		
		if(low > high) {
			System.out.println("찾는 값은 없습니다");
		}

		scan.close();
	}
}
