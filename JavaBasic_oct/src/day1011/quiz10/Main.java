package day1011.quiz10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		User u1 = new User("홍길동", 20, 123123);
		System.out.println("<u1 찍어보기 테스트>");
		
		//getter로 가져올수도 있지만 나는 info로 정보를 출력해주는 method사용.
		//System.out.println(u1.getName() + u1.getAge() + u1.getRrn());
		u1.info();
		
		/* 문제2
		 * 1. 2개의 크기를 갖는 User배열을 선언하세요. (User배열은 User클래스를 저장할 수 있습니다.)
		 * 2. 두번째 User객체를 생성하세요. ("김길동", 30, rrn값)을 저장.
		 * 3. User배열에 두 객체를 저장하세요.
		 * 4. 향상된 포문을 사용해서  *모든변수*를 출력하세요.
		 * ex) User[] arr = new User[2];
		 */
		User u2 = new User("김길동", 30, 123456);
		User[] arr = new User[2];
		
		arr[0] = u1;
		arr[1] = u2;
		
		int count = 1;
		for(User u : arr) {
			System.out.println("==============" + count++ + "번째 고객정보================");
			u.info();
		}
		
		/* 문제 3
		 * 1. 5개의 크기를 갖는 User배열을 선언하세요.
		 * 2. 5번회전하는 while 안에서 Scanner객체를 이용하여 name, rrn, age을 입력받으세요
		 * 3. while문 안에서 User객체를 생성하고, 입력받은 name과 rrn, age을 저장하세요.
		 * 4. while문 안에서 User객체를 User배열에 저장하세요.
		 * 5. Arrays.toString(배열명) 을 이용하여 저장되는 값을 확인하세요. 
		 */
		
		User[] arr_u = new User[5];
		int i = 0;
		while(i < 5) {
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름 >");
			String name = scan.nextLine();
			
			System.out.print("나이 >");
			int age = scan.nextInt();
			
			System.out.print("rrn >");
			int rrn = scan.nextInt();
			
			User user = new User(name, age, rrn);
			arr_u[i] = user;
			
			i++;
		}
		System.out.print("Arrays.toString 으로 찍어본 값 : ");
		System.out.println(Arrays.toString(arr_u));

		count = 1;
		for(User p_u : arr_u) {
			System.out.println("==============" + count++ + "번째 고객정보================");
			p_u.info();
		}
	}
	
}
