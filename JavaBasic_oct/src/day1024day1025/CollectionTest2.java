package day1024day1025;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest2 {
	
	public static void main(String[] args) {
		
		/* ArrayList와 LinkedList의 시간 비교 */
		
		//문자열을 저장하는 ArrayList 생성
		ArrayList <String> al = new ArrayList<>();
		
		al.add("One");
		al.add("Three");
		
		//1970년 1월 1일 자정부터 지나온 시간을 밀리초 단위의 정수로 가져오기
		long start = System.currentTimeMillis();
		//100000 데이터를 두번째에 추가
		for(int i = 0; i < 100000; i++) {
			al.add(1, "Two");
		}
		long end = System.currentTimeMillis();
		//걸린 시간 확인
		System.out.println("ArrayList : " + (end-start));
		
		
		//문자열을 저장하는 LinkedList 생성
		LinkedList <String> li = new LinkedList<>();
		
		li.add("One");
		li.add("Three");
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			li.add(1, "Two");
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList : " + (end-start));
	}

}
