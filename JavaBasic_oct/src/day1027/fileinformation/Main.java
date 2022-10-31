package day1027.fileinformation;

import java.io.File;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		//파일에 대한 정보 확인
		try {
			//file 인스턴스 생성 - windows에서는 dir구분 기호가 \이다.
			// 프로그래밍 언어에서는 \가 오고 하나의 문자가 오면 제어문자로 인식하기 때문에 \\로 사용한다.
			File f = new File("C:\\Users\\user\\Desktop\\Test.txt");
			
			//파일의 존재 여부 확인
			System.out.println(f.exists());
			//마지막 수정 날짜
			System.out.println(f.lastModified());
			System.out.println(new Date(f.lastModified()));
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
	}

}
