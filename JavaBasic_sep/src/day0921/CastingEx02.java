package day0921;
/**
 * 9/21
 * 형변환 필요 (캐스팅)
 */

public class CastingEx02 {
	public static void main(String[] args) {
		
		/*
		 * 크기가 큰 타입을 작은 타입으로 변환할때 (type) 캐스팅을 이용해서
		 * 명시적 형변환을 해야합니다. 
		 */
		
		int i = 70;
		//char c = i; error:cannot convert from int to char
		char c = (char)i;
		short s = (short)i;
		System.out.println("c:" + c + " s:" +s);
		
		double d = 3.14;
		int k = (int)d; 
		
		System.out.println("k:" + k);
		
		/*
		 * 캐스팅을 할때 주의 할 점!
		 * 해당 값을 받을 수 없는 범위가 들어오면 잘려나간다.
		 * 즉, 쓰레기값이 저장된다.
		 */
		
		int a = 1000;
		byte b = (byte)a;
		//byte는 1000의 값을 가질 수 없다. 128까지 가능이니까. 쓰레기값이 들어간다.
		//1000이 (바이너리값 0011 1110 1000임. byte니까 앞부분이 잘려서 1110 1000만 사용) = -24 
		System.out.println("b:" + b);
		
		/*
		 * 예외적인 casting case
		 * char, short는 크기가 같지만
		 * 문자형과 숫자형이기 때문에, 형변환이 필요하다.
		 */
		char cc = 'A';
		short ss = (short)cc;
		
		System.out.println(ss);
		
	}

}
