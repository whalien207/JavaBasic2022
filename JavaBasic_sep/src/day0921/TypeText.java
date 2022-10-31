package day0921;
/**
 * 9/21
 */

public class TypeText {

	public static void main(String[] args) {
		
//단일문자를 저장하는 char
		char c1 = 'A';
		char c2 = 65; 
		//아스키코드-> 유니코드의 등장으로 2byte로 확장되고 부호없는 비트값 65536개의 문자를 표기.
		
		System.out.println(c1);
		System.out.println(c2);
		
		char c3 = '가';
		char c4 = 44032; //유니코드(UTF-8) 한글코드표 16진수로 AC00
		char c5 = '\uAC00'; //u는 유니코드 표시
		
		System.out.println(c3 + "-" + c4 + "-" + c5);
		
//문자열
		String s1 = "hello";
		String s2 = " world"; // 공백도 문자로 인식됨.
		
		//문자열은 +로 연결하면 붙인 결과를 가져옵니다.
		System.out.println(s1 + s2);
		
		//문자열의 길이를 알려주는 length()
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		//문자열과 다른 타입의 + 연산
		System.out.println(100 + 200); //300
		System.out.println("100" + 200); // 문자는 가장 강력한 타입 (문자열 우선) , 문자열에 다른타입 붙으면 결과는 문자열이 된다.
		System.out.println(100 + 200 + "world"); // 300world
		System.out.println("world" + 100 + 200); // world100200 문자열이 먼저나오면 뒤에는 다 문자됨.
		
		//??#형변환과 데이터의 크기
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10); 
		
		//75인이유 = char + int 는 int , char형으로 보고 싶다면 캐스팅 진행.
		//캐스팅을 진행하면 A에서 10칸 넘어간 문자 (아스키 기준)
		System.out.println((char)('A' + 10));
		
	}
}
