package day1026.set;

import java.util.ArrayList;
import java.util.Random;
import java.util.TreeSet;

public class Lotto {
	
	public static void main(String[] args) {
		//랜덤한 숫자를 추출하기 위한 인스턴스 생성
		Random r = new Random();
		
		//ArrayList 활용
		ArrayList <Integer> al = new ArrayList<>();
		//ArrayList의 사이즈가 6보다 작을 때 까지.
		while(al.size() < 6) {
			//1~45까지의 숫자를 랜덤하게 추출
			int su = r.nextInt(45) + 1;
			//중복 검사를 해서 통과하면 add하고 통과하지 못하면 add를 수행하지 않음.
			if(al.contains(su)) {
				continue;
			}
			al.add(su);
		}
		//출력전에 정렬
		al.sort(null);
		System.out.println(al);
		
		/* TreeSet으로 구현 */
		TreeSet <Integer> ts = new TreeSet<>();
		while(ts.size() < 6) {
			int num = r.nextInt(45) + 1;
			ts.add(num);
		}
		System.out.println(ts);
	}

}
