package day1018.api.lang.string;

import java.util.Arrays;

public class StringEx {
	
	public static void main(String[] args) {
		
		String s = "홍길동";
		s.charAt(0);
		
		//길 문자를 찾으면 위치반환 못찾으면 -1 return
		int index = s.indexOf("길");
		System.out.println("길 위치 :" + index);
		
		//replace - 원본 문자는 유지
		String result = s.replace("길","");
		System.out.println(result);
		System.out.println("원본문자열: " + s);
		
		// substring - 문자열자르기
		String s2 = "오늘은 날씨가 추워요";
		String result2 = s2.substring(4);
		System.out.println(result2); //4미만 절삭
		
		String result3 = s2.substring(4,7);
		System.out.println(result3); //4이상 7미만 추출
		
		//trim - 앞뒤 공백제거
		System.out.println("   홍길동    ".trim());
		
		//split - 문자열 자르기
		String[] result4 = s2.split(" ");
		System.out.println(Arrays.toString(result4));
		
		String[] result5 = "010-1234-3456".split("-", 2);
		System.out.println(Arrays.toString(result5));
		
		//문자열 포함 여부
		if (s.contains("홍")){
			System.out.println("홍이 포함됨");
		}
		
		String result6 = String.copyValueOf(new char[] {'a','b','c'});
		System.out.println(result6);
		
		String result7 = String.valueOf(3);
		System.out.println("문자열 바뀐 결과:" + result7);
		
	}

}
