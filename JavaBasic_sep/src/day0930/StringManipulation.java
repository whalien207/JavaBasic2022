package day0930;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		//문자열 다루기
		//아래와 같이 String은 배열을 기반으로 만들어진다.
		//String str = new String(new char[] {'A', 'B', 'C'});
		//System.out.println(str);

		String str = "안녕하세요~";

		//문자열의 길이를 확인
		//-바로 출력
		System.out.println(str.length());

		//-변수에 넣어서 출력
		int len = str.length();
		System.out.println(len);

		//문자열을 한글자 자르기 charAt(index)
		char c = str.charAt(5); //.charAt(0);
		System.out.println(c);

		//문자열의 위치 확인 indexOf, lastIndexOf - 찾은 문자의 위치를 반환
		int a = str.indexOf("녕");
		System.out.println("찾은 위치:" + a); // 찾은 "녕"의 index값을 반환

		int b = str.lastIndexOf("녕");
		System.out.println("찾은 위치:" + b); // 찾은 "녕"의 index값을 반환

		int d = str.indexOf("sdf");
		System.out.println("찾는 문자가 없다면:" + d); // 찾는 문자가 없다면 -1 반환

		//문자열 변경 - replace(찾을 문자, 바꿀 문자)
		String e = str.replace("안", "헐"); // 안 -> 헐 (전부다)
		System.out.println(e); // 헐녕하세요
		System.out.println(str); // 안녕하세요 (replace의 특징 원본문자는 그대로 유지)

		//대소문자 변경 toUpperCase, toLowerCase
		str = "abcDEFg";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		//공백제거 trim or replace
		str = "     010-1234-5678      ";
		String g = str.trim();
		System.out.println(g);

		str = " 안 녕 하 세 요 개 천 절 날 은 쉽니다   " ;
		System.out.println(str.trim()); // trim을 사용하는 경우 앞/뒤 공백만 사라지므로...

		String f = str.replace(" ", ""); //replace사용
		System.out.println(f);

		//String.valueOf() -> 기본타입을 문자로 변경
		System.out.println(String.valueOf(10) + 20);

		//문자열 자르기★
		// substring - index 기분으로 자름.
		str = "010-1234-5678";
		String j = str.substring(3); //인덱스 미만 절삭.
		System.out.println(j);
		
		j = str.substring(4, 8); // 인덱스 이상 ~ 인덱스 미만 추출
		System.out.println(j);
		
		// split - 특정문자 기준으로 잘라서 배열로 담아줌
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		for(String x : arr) {
			System.out.println(x);
		}
		
		// toCharArray
		char[] arr2 = str.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		





	}
}
