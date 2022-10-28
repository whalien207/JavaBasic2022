package day1014.inter.basic3;

public class Cat extends Animal implements IPet{

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 못먹음.");
	}

	@Override
	public void play() {
		System.out.println("고양이는 캣타워에 살아요");
	}

}
