package day1018.api.lang.wrapper;

public class Autoboxing {
	
	public static void main(String[] args) {
		
		//AutoBoxing 자동형변환
		int a = 100;
		
		Integer val = a;
		
		a = val;//상호형변환 가능.
		
		Object[] arr = {1, 2, 3};

		int v = Integer.parseInt("3");
		int v2 = Integer.parseInt("34");
		
		System.out.println(v + v2);
		
		double v3 = Double.parseDouble("3.14");
		long v4 = Long.parseLong("234234234242");
		
		System.out.println(v + v2 + v3 + v4);
	}

}
