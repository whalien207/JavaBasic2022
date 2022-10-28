package day1014.inter.basic2;

public class Basic implements BasicInter{
	
	/*
	 * interface에 추상method를 정의해 놓았다.
	 * 실제 기능은 오버라이딩을 통해 class에서 직접 구현
	 */
	
	@Override
	public void insert(int a) {
		System.out.println("insert....");
	}
	
	@Override
	public void info() {
		System.out.println("info");
	}
	
	@Override
	public String getInfo() {
		System.out.println("getInfo");
		return "getInfo";
	}
	
	@Override
	public int delete() {
		System.out.println("delete int");
		return 0;
	}

}
