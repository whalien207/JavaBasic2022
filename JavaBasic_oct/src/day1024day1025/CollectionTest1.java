package day1024day1025;

import java.util.Arrays;

public class CollectionTest1 {
	
	public static void main(String[] args) {
		String [] ar = {"List", "Set", "Map"};
		
		//배열의 데이터를 수정하는 것은 가능
		ar[2] = "HashTable";
		System.out.println(Arrays.toString(ar));
		
		//ar 배열에 데이터를 추가
		//ar배열보다 1개 더 큰 공간을 갖는 배열을 생성
		String [] br = new String[ar.length+1];
		//ar의 내용을 복사
		for(int i = 0; i < ar.length; i++) {
			br[i] = ar[i];
		}
		
		//br의 마지막에 데이터 추가
		br[br.length-1] = "Properties";
		//br이 가리키는 곳을 ar이 가리키도록 합니다.
		ar = br;
		System.out.println(Arrays.toString(br));
		
		//연습 : Set (1번쨰 data)를 삭제하기
		for(int i = 0; i < ar.length; i++) {
			
		}
		
	}

}
