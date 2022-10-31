package day1024day1025;

import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionTest3 {
	
	public static void main(String[] args) {
		
		//100000 개의 데이터를 가진 ArrayList 와 LinkedList 생성
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0; i<100000; i++) {
			al.add(i);
		}
		
		LinkedList<Integer> li = new LinkedList<>();
		for(int i = 0; i<100000; i++) {
			li.add(i);
		}
		
		/* 조회시 시간비교 */
		//ArrayList에서 100000 개의 데이터를 읽는데 걸리는 시간
		//데이터를 가져오는 메서드는 get
		//실행해서 가장 마지막에 나오는 숫자를 확인한 후 al을 li로 변경해서 실행하고 숫자는 확인
		
		long start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			al.get(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList : " + (end-start));
		
		start = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			li.get(i);
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList : " + (end-start));
		
	}

}
