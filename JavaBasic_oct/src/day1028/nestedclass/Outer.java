package day1028.nestedclass;

public class Outer {
	//내포 클래스 - 다른 클래스 안에 만들어진 클래스
	class Inner{
		public int num;
	}
	
	//내포 클래스 안에 static 멤버가 있으면 인스턴스 생성없이 사용할 수 있도록 static을 추가
	static class StaticInner{
		public int num;
		public static int share;
	}
	
	public void method() {
		//method안에 만들어진 class = Local Inner
		//method안에서만 사용이 가능한 클래스
		class LocalInner{
			public int num;
		}
	}
	
}
