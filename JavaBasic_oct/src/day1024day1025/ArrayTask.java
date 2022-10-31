package day1024day1025;

import java.util.Arrays;

public class ArrayTask {
	
	public static void main(String[] args) {
		//문자열 배열 생성
		String[] ar = {"카리나", "아이린", "윈터", "조이", "슬기"};
		
		//배열을 순회하면서 출력
		/*
		for(String singer : ar){
			System.out.println(singer);
		}
		*/
		
		//문자열의 크기비교 하는 method - compareTo(크기가 크면 양수 작으면 음수 같으면0 return)
		//System.out.println(ar[4].compareTo(ar[0]));
		
		//배열의 복제
		String[] copyAr = Arrays.copyOf(ar, ar.length);
		
		//선택정렬 - 실무에서는 사용안함(성능이 떨어짐)
		//첫번째 부터 n-1번쨰 data까지 
		for(int i = 0; i < copyAr.length-1; i++) {
			//자신의 뒤에 있는 모든 data와 비교
			for(int j = i+1; j < copyAr.length; j++) {
				//뒤에 있는 data가 더 크면 교환 (부등호 방향에 따라 오름차순, 내림차순 가능)
				if(copyAr[i].compareTo(copyAr[j]) > 0) {
					String temp = copyAr[i];
					copyAr[i] = copyAr[j];
					copyAr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(copyAr));
	}

}
