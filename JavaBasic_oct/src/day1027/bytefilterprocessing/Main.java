package day1027.bytefilterprocessing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		//바이트 단위로 파일에 기록하기 - log 기록
		try {
			//오늘 날짜를 문자열로 만들기
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			//기록할 파일 만들기
			FileOutputStream fos = new FileOutputStream("./"+sdf.format(date)+".txt", true);
			
			//기록할 메세지 생성 후 기록
			String msg = "hello\n";
			fos.write(msg.getBytes());
			
			//파일 닫기
			fos.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		//앞에서 작성한 파일 읽기
		try {
			FileInputStream fis = new FileInputStream("./2022-10-27.txt");
			
			//읽어서 저장할 바이트 배열을 생성
			byte[] b = new byte[fis.available()];
			fis.read(b);
			
			//출력
			System.out.println(new String(b));
			System.out.println(Arrays.toString(b ));
			//닫기
			fis.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
