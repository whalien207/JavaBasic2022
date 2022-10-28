package day1014.inter.basic3;

public class PetHouse {
	
	//1.IPet타입을 받아서 기능을 출력하는 메서드
	public static void print(IPet p) {
		p.play();
	}
	
	//2.IPet[] 타입을 받아서 기능을 전부 출력하는 메서드.
	public static void print(IPet[] p_arr) {
		for(IPet i : p_arr) {
			i.play();
		}
	}
 
}
