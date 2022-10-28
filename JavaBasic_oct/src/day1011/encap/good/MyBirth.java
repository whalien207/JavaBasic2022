package day1011.encap.good;

public class MyBirth {
	
	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 * 은닉된 변수에 접근할 때 클래스 설계자가 만들어 놓은
	 * getter / setter method를 사용합니다.
	 * 
	 * 국룰...
	 * get시작(값을 얻는다.)
	 * set시작(값을 저장.)
	 * 
	 * set method
	 * 1. 값을 저장하는 method
	 * 2. public으로 선언하고 set + 멤버변수명으로 저장.
	 */
	
	public void setYear(int year) {
		
		//유효값 검증
		if(year > 2022 || year < 1900) {
			System.out.println("년도는 1900~2022년까지 입니다.");
		} else {
			System.out.println("년도 저장완료");
			this.year = year;
		}
	}
	
	/*
	 * getter method
	 * 1. 값을 조회하는 method
	 * 2. public으로 선언하고 get + 멤버변수명으로 지정
	 */
	
	public int getYear() {
		return year;
	}
	
	
	/*
	 * month, day, ssn에 대한 getter, setter 생성
	 * month - 1~12월 까지만 저장가능
	 * day - 1~31 일까지만 저장가능
	 * ssn - 하이픈을 제거하고 13자리 까지만 저장가능.
	 */
	
	public void setMonth(int month) {
		if(month < 0 || 12 < month) {
			System.out.println("1월 부터 12월까지 입력가능합니다.");
		} else {
			System.out.println("월 저장완료");
			this.month = month;
		}
	}
	
	public void setDay(int day) {
		if(day < 0 || 31 < day) {
			System.out.println("1일 부터 31일까지 입력가능합니다.");
		}else {
			System.out.println("일 저장완료");
			this.day = day;
		}
		
	}
	
	public void setSsn(String ssn) {
		String valid_ssn = ssn.replaceAll("-","");
		if(valid_ssn.length() != 13) {
			System.out.println("-을 제외하고 13자리 입력가능합니다.");
		}else {
			System.out.println("주민번호 저장완료");
			this.ssn = ssn;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	public String getSsn() {
		return ssn;
	}



}
