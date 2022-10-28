package day1012.encap.obj;

public class Hotel { //사용자클래스
	
	/*
	String 변수도 근본적으로는 new String으로 초기화를 해주는것과
	아래 객체를 new해서 사용하겠다고 초기화 해주는것이 같다.
	public String str = new String("dd");
	public Chef chef = new Chef();
	*/
	
	private Chef chef;
	
	public Hotel() {
		//기본 생성자
	}
	
	//생성자의 - 클래스를 받는 생성자
	public Hotel(Chef chef) {
		this.chef = chef;
	}
	
	//chef를 private으로 제한하고 있기 때문에 getter, setter를 만들어주었다.
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public Chef getChef() {
		return this.chef;
	}
	
	
}
