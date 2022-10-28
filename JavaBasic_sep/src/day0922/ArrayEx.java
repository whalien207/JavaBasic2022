package day0922;
import java.util.Arrays;

/**
 * 9/22
 * 배열
 */

public class ArrayEx {
	public static void main(String[] args) {

		//배열은 선언, 생성, 초기화 과정을 거칩니다.

		//1. 배열의 선언
		int[] arr;

		//2. 배열의 생성
		arr = new int[5];
		System.out.println("초기화 전 주소값:" + arr);//주소값(위치)가 출력된다.

		//3. 배열의 초기화

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		//arr[5] = 60; !!!error 0~4까지 5칸이다 주의.

		//4. 배열의 사용
		System.out.println("arr 첫번째 상자:" + arr[0]);
		System.out.println("arr 세번째 상자:" + arr[2]);

		//5. 배열의 모습을 문자열로 확인하는 명련문 (암기하라)
		System.out.println(Arrays.toString(arr));
		
		//6. 배열의 길이를 확인하는 명령어 .length (암기하라)
		System.out.println("배열의 크기:" + arr.length);
		
		//7. 배열의 선언과 생성을 동시에
		byte[] arr2 = new byte[10];
		
		//배열의 초기값을 지정하지 않으면 각 타입의 기본값으로 자동초기화
		//ex ) 0, 0.0, null
		System.out.println(Arrays.toString(arr2));
		
		//8. 배열의 선언 생성 초기화를 동시에 {중,괄,호} 를 이용
		int[] arr3 = {1,2,3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("==============================");
		
		/*
		 * 1. string 배열을 생성하고 월, 화, 수, 목, 을 저장
		 * 2. 크기가 3인 int배열을 생성하고 1-10중 랜덤 값을 저장할것.
		 */
		
		//1. string 배열을 생성하고 월, 화, 수, 목, 을 저장
		
		/*
		String[] s_arr = new String[4];
		s_arr[0] = "월";
		s_arr[1] = "화";
		s_arr[2] = "수";
		s_arr[3] = "목";
		*/
		
		//위 코드의 간략화
		String[] s_arr = {"월", "화", "수", "목"};
		
		System.out.println(Arrays.toString(s_arr));
		
		// 2. 크기가 3인 int배열을 생성하고 1-10중 랜덤 값을 저장할것.
		int[] i_arr = new int[3];
		
		i_arr[0] = (int)(Math.random() * 10) + 1;
		i_arr[1] = (int)(Math.random() * 10) + 1;
		i_arr[2] = (int)(Math.random() * 10) + 1;
		
		/*
		int i = 0;
		
		while(i<3) {
			i_arr[i++] = (int)(Math.random() * 10) + 1;
		}
		*/
			
		System.out.println(Arrays.toString(i_arr));
		
		
	}

}
