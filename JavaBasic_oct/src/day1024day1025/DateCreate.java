package day1024day1025;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCreate {
	
	public static void main(String[] args) {
		
		//현재 시간을 갖는 Date 인스턴스 생성
		Date currentTime = new Date();
		//출력 - 년월일 시분초
		System.out.println(currentTime);
		
		//원하는 날짜를 가지고 생성 1995년 2월 7일 12:45:00로 설정
		Date firstMeetingTime = new Date(95, 2-1, 7, 12, 45, 0);
		//출력 - 
		System.out.println(firstMeetingTime);
		
		//년도만 추출해서 출력
		//방법1
		System.out.printf("%tY년\n", firstMeetingTime);
		//방법2
		SimpleDateFormat sdf = new SimpleDateFormat("Y년");
		System.out.println(sdf.format(firstMeetingTime));
		//방법3
		System.out.println(firstMeetingTime.getYear()+1900+"년");
		
		//원하는 포맷으로 출력
		//1986년 5월 5일 ?요일이라고 출력
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy년 M월 d일 E요일");
		System.out.println(sdf2.format(firstMeetingTime));
		
		//연습해볼만한 과제  - 년월일을 비교해서 년월일이 같으면 시간과 분을 그렇지 않으면 년월일을 출력 
		
	}

}
