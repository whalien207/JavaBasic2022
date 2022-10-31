package day0920;
/**
 * 9/20
 * 출력에 대하여, 출력의 모든 것
 * print / println / printf
 */

/*
 * 단축키
 * ctrl + x = 잘라내기
 * end, home으로 커서를 마지막, 처음으로 이동 shift + home, end
 * 
 * 정렬키 (코드 정렬)
 * ctrl + a, ctrl + i
 * 
 * 행 삭제
 * ctrl + d
 * 행 복사
 * ctrl + alt + 방향키
 * 
 * 코드 이동
 * alt + 방향키
 * 
 * 빠른주석
 * ctrl + /
 */

public class SystemOut {

	public static void main(String[] args) {

		//문자와 숫자
		//ctrl+s 저장 / ctrl + f11 실행

		//""는 문자를 위미한다. 숫자는 그냥 값을 적어주면 된다.
		System.out.print("1");
		System.out.print("\n");
		System.out.print(1);
		System.out.print("\n");

		// sysout이라 적고 ctrl+space 출력문을 자동생성
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");

		//형식을 지정하는 출력문 printf
		//문자형식을 미리지정하고, 필요한 출력값을 지정하는 형태
		/*
		 * 서식문자
		 * %s - 문자열을 입력받음
		 * %d - 정수를 입력받음
		 * %f - 실수를 입력받음(%.2f - 소수부 자리수를 의미한다, 기본 6자리로 나오기 때문)
		 * \n 줄바꿈 
		 * \t는 tab 8칸 들려쓰기 출력
		 */
		System.out.printf("안녕하세요. 제 이름은 %s입니당~!\n", "홍길동");
		System.out.printf("오늘은 %d월 %d일 입니다.\n", 9, 20);
		System.out.printf("파이의 값은 %.2f 입니다.\n", 3.14);
		System.out.printf("%d x %d = %d\t%d x %d = %d", 2, 1, 2, 2, 2, 4);

	}
}
