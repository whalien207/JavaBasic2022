package day1026.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClassCompare {
	
	public static void main(String[] args) {
		//문자열을 저장하는 Set 인스턴스를 3개 생성
		Set<String> hashSet = new HashSet<>();
		Set<String> likedHashSet = new LinkedHashSet<>();
		Set<String> treeSet = new TreeSet<>();
		
		hashSet.add("LG EDS");
		likedHashSet.add("LG EDS");
		treeSet.add("LG EDS");
		
		hashSet.add("ebsoft");
		likedHashSet.add("ebsoft");
		treeSet.add("ebsoft");
		
		hashSet.add("kairosoft");
		likedHashSet.add("kairosoft");
		treeSet.add("kairosoft");
		
		hashSet.add("SM");
		likedHashSet.add("SM");
		treeSet.add("SM");
		
		hashSet.add("Hybe");
		likedHashSet.add("Hybe");
		treeSet.add("Hybe");

		/* 중복된 내용을 add 해도 저장이 안됨. */
		hashSet.add("Hybe");
		likedHashSet.add("Hybe");
		treeSet.add("Hybe");
		
		hashSet.add("Hybe");
		likedHashSet.add("Hybe");
		treeSet.add("Hybe");
		
		//데이터출력
		//HashSet
		System.out.println("## HashSet : 무슨 순서로 나오는지 알수 없다.");
		for(String company : hashSet) {
			System.out.println(company + "\t");
		}
		System.out.println();
		
		//LinkedHashSet
		System.out.println("## LinkedHashSet : 저장한 순서를 기억하고 있다. (저장한 순서대로 출력)");
		for(String company : likedHashSet) {
			System.out.println(company + "\t");
		}
		System.out.println();
		
		//TreeSet
		System.out.println("## TreeSet : 아스키코드로 정렬된 순서이다 (숫자>대문자>소문자 순으로)");
		for(String company : treeSet) {
			System.out.println(company + "\t");
		}
		System.out.println();
		
		
	}

}
