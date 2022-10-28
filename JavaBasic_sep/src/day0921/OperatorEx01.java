package day0921;
/**
 * 9/21
 * 연산자 - 단항
 */

public class OperatorEx01 {
	public static void main(String[] args) {
		
		//단항 연산자
		int i = -3;
		int j = -i;
		System.out.println("j:" + j);
		
		//++, --
		int k = 1;
		k++;
		System.out.println("k:"+ k);
		k--;
		System.out.println("k:"+ k);
		
		//증감연산자는 a++, ++a 의미가 조금 다르다.
		k = 1;
		int h = k++; // 먼저 대입, 이후에 증가.
		System.out.println("k:" + k);
		System.out.println("h:" + h);
		
		k = 1;
		int g = ++k; // 먼저 증가, 후에 대입.
		System.out.println("k:" + k);
		System.out.println("g:" + g);
		
		k=1;
		System.out.println(k++);//1출력 후 2되었다.
		System.out.println(++k);//2+1 = 3되고 출력.
		
		System.out.println("--------------------");
		
		//~ 연산자 - 2진수값을 반대로 (쓸일은 없음)
		byte b = 10; // 0000 1010
		System.out.println(~b); // 1111 0101
		System.out.println(~b +1); //-10 보수관계이다.(특징)
		
		System.out.println("--------------------");
		
		System.out.println(!true); //false
		
		boolean bool = !false;
		System.out.println(bool); // true
		
	}

}
