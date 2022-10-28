package day0923;

public class SwitchEx03 {
	public static void main(String[] args) {
		
		String[] arr = {"안녕", "hello", "사요나라", "@#$"};
		
		//System.out.println(arr[0]);
		
		/*
		 * Math.random() 을 사용해서 배열의 인덱스 범위 (0~3) 까지 랜덤수를 만듭니다.
		 * 랜덤수를 배열의 index에 적용해서 
		 * 출력된 단어가 한국어, 영어, 일본어, 알수없는 언어
		 * 인지 처리를 해보세요. (switch문으로 해보시오)
		 */
		
		int index = (int)(Math.random() * 4);
		
		System.out.println("선택된 단어:" + arr[index]);
		
		//switch에 들어가는 조건값은 정수, 문자여야 한다.
		//방법1
		switch (index) {
		case 0:
			System.out.println("한국어");
			break;
		case 1:
			System.out.println("영어");
			break;
		case 2:
			System.out.println("일본어");
			break;
		default:
			System.out.println("알수없는 언어");
			break;
		}
		
		//방법2
		switch (arr[index]) {
		case "안녕":
			System.out.println("한국어");
			break;
		case "hello":
			System.out.println("영어");
			break;
		case "사요나라":
			System.out.println("일본어");
			break;
		default:
			System.out.println("알수없는 언어");
			break;
		}
			
	}

}
