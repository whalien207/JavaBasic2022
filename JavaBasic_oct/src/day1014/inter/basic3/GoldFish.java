package day1014.inter.basic3;

public class GoldFish extends Fish implements IPet{

	@Override
	public void swim() {
		System.out.println("금붕어는 강에서 살아요");
	}

	@Override
	public void play() {
		System.out.println("금붕어는 우리집 어항으로...");
	}

}
