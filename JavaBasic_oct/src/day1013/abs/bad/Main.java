package day1013.abs.bad;

public class Main {
	
	public static void main(String[] args) {
		
		SeoulStore s = new SeoulStore();
		s.apple();
		s.melon();
		// 오버라이딩을 반드시 해야하는데, 하지 않았다면 잘못된 method가 실행될 수 있다.
		s.orange();
	}

}
