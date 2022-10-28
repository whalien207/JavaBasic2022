package day1014.inter.basic;

//표면적으로 아무것도 상속받지 않았다고 해도 default로 Object를 상속받고 있는 것임.
public class Basic /*extends Object*/ implements Inter1, Inter2{

	/* interface는 implements 키워드로 상속받는다.*/
	
	@Override
	public void method01() {
		System.out.println("오버라이딩 된 method01");
	}
	
	@Override
	public void method02() {
		System.out.println("오버라이딩 된 method02");
	}
}
