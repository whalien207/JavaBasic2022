package day1013.static_.basic;

public class PrintArray {
	
	private PrintArray() {} // 객체 생성불가 하도록
	
	static String  toArray(int[] arr) {
		String s = "[";
		for(int i = 0; i < arr.length; i++) {
			if( 1 <= i ) {
				s += ", ";
			}
			s += arr[i];
		}
		s += "]";
		return s;
	}
	
	static String toArray(char[] arr) {
		String s = "[";
		for(int i = 0; i < arr.length; i++) {
			if( 1 <= i ) {
				s += ", ";
			}
			s += arr[i];
		}
		s += "]";
		return s;
	}

	static String toArray(String[] arr) {
		String s = "[";
		for(int i = 0; i < arr.length; i++) {
			if( 1 <= i ) {
				s += ", ";
			}
			s += arr[i];
		}
		s += "]";
		return s;
	}
	
	

}
