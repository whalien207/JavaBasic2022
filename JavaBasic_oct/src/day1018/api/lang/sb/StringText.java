package day1018.api.lang.sb;

public class StringText {
	
	public static void main(String[] args) {
		   
		long start = System.currentTimeMillis();
		String str = "";
		for(int i = 1; i < 300000; i++) {
			str += "A";
		}
		long end = System.currentTimeMillis();
		
		long start_sb = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("");
		for(int i = 1; i < 300000; i++) {
			sb.append("A");
		}
		long end_sb = System.currentTimeMillis();
		
		
		System.out.println("String 걸린 시간: " + (end - start) * 0.001);
		System.out.println("StringBuffer 걸린 시간: " + (end_sb - start_sb) * 0.001);
		
	}

}
