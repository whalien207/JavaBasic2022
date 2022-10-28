package day1011.encap.good;

public class Main {
	
	public static void main(String[] args) {
		
		MyBirth me = new MyBirth();
		me.setYear(2023);
		me.setYear(1999);//set
		
		me.setMonth(13);
		me.setMonth(4);
		
		me.setDay(32);
		me.setDay(21);
		
		me.setSsn("aslkdfj"); 
		me.setSsn("990421-2222222");
		
		int year = me.getYear();//get
		int month = me.getMonth();//get
		int day = me.getDay();//get
		
		System.out.println(year+"년"+month+"월"+day+"일");
		
		String ssn = me.getSsn();//get
		System.out.println(ssn);
		
		
	}

}
