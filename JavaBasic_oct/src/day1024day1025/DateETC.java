package day1024day1025;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateETC {
	
	public static void main(String[] args) {
		//날짜와 시간을 다른 형태로 사용하는 클래스
		Calendar cal = new GregorianCalendar();
		//date보다 많은 정보를 출력
		System.out.println(cal);
		
		//특정 data를 조회 - 년도 추출
		System.out.println(cal.get(Calendar.YEAR));
		
		//최근에 맣이 사용하는 날짜 타입
		LocalDateTime ldt = LocalDateTime.of(2022, 10, 27, 18, 50);
		System.out.println(ldt);
	}

}
