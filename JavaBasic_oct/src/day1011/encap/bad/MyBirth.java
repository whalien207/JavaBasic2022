package day1011.encap.bad;

public class MyBirth {
	
	//bad test case
	public int year;
	public int month;
	public int day;
	public String ssn; // 주민번호
	
	public void info() {
		System.out.println(year + "년" + month + "월" + day + "일");
		System.out.println("주민번호: " + ssn);
	}

}
