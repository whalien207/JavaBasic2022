package day1017.inter.inherit;

public interface Inter2 {
	
	void some3();
	default void some4() {
		System.out.println("디폴트 메서드");
	}

}
