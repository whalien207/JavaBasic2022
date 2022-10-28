package day0928;

public class BreakEx03 {

	public static void main(String[] args) {

		//중첩반복문의 탈출

		/*
		 * 대문자A - 소문자 a-z
		 * ....
		 * 대문자Z - 소문자 a-z
		 * 되는 반복문.
		 */

		/* 원초적인 방법의 중첩반복문 break
		boolean flag = false; // 원초적인 방법

		for(char c = 'A'; c <= 'Z'; c++) {

			for(char l = 'a'; l <= 'z'; l++) {

				System.out.println(c + "-" + l);

				//같은 문자의 대소문자 매칭
				if(l == c+32) {
					flag = true;
					break;
				}
			}// inner
			if(flag) break; // flag가 true면 탈출 (바깥for문 break)
		} 

		 */

		/* label: 을 사용하여 중첩반복문 break */
		label_test:for(char c = 'A'; c <= 'Z'; c++) {

			for(char l = 'a'; l <= 'z'; l++) {

				System.out.println(c + "-" + l);
				if(l == c+32) break label_test;
			}// inner
		}

	}

}
