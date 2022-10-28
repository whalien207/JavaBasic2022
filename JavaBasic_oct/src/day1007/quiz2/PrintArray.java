package day1007.quiz2;

public class PrintArray {
	
	/*overloading : Arrays.toString() 만들어보기.*/
	
	String toArray(int[] arr) {
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
	
	String toArray(char[] arr) {
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

	String toArray(String[] arr) {
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
