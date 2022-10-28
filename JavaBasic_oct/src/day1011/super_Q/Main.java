package day1011.super_Q;

public class Main{
	
	public static void main(String[] args) {
		
		SuperSonicAp n = new SuperSonicAp("ss1011", 0);
		
		n.fly();
		System.out.println(n.info());
		
		SuperSonicAp s = new SuperSonicAp("ss1011-2", 1);
		
		s.fly();
		System.out.println(s.info());
	}
}
