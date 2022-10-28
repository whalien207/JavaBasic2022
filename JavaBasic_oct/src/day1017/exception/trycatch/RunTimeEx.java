package day1017.exception.trycatch;

public class RunTimeEx {
	
	public static void main(String[] args) {
		
		//실행에외(runtime)
		String s = null;
		
		if(s != null) {
			s.charAt(0);
		}
		
		//ArrayIndexOut
		/*
		int[] arr = {1,2,3};
		arr[5] = 10;
		*/
		
		/*
		Object o = new Object();
		Person p = (Person)p;
		*/
		
		/*
		String s = "홍길동";
		Integer.parseInt(s);
		*/
	}

}
