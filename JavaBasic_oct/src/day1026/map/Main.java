package day1026.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		//HashMap으로 인스턴스 생성
		Map<String, Object> map = new HashMap<>();
		
		//Map에 데이터 저장 - put
		map.put("num", 1);
		map.put("name", "아담");
		map.put("job", "Singer");
		//동일한 key에 데이터를 저장하면 이전 데이터가 삭제되고 수정됨
		map.put("job", "Cyber Singer");
		
		System.out.println(map);
		
		//map에서 데이터 가져오기
		System.out.println(map.get("name"));
		//존재하지 않는 key를 사용하면 자바는 null을 리턴
		System.out.println(map.get("age"));
		
		//Map을 이용하면 key의 이름을 몰라도 모든 데이터를 접근하는 것이 가능
		Set<String> keys = map.keySet();
		//Set을 순회
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}
	}

}
