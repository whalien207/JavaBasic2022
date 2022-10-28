package day1014.inter.basic3;

public class Main {
	
	public static void main(String[] args) {
		
		/* 다형성 */
		//Dog d = new Dog(); //eat, play사용가능
		//Animal d = new Dog; //eat만 가능
		//Ipet d = new Dog(); //play만 가능
		
		Animal baduk = new Dog();
		Animal nabi = new Cat();
		Animal hodol = new Tiger();
		
		//1.Animal 배열에 저장.
		Animal[] arr = {baduk, nabi, hodol};
		for(Animal a : arr) {
			System.out.print("Animal: ");
			a.eat();
		}
		
		//2.baduk은 Animal이지만 생성된 클래스가 interface 상속을 받고 있다면,
		//상호형변환이 된다. (Ipet이기도 함)

		IPet i = (IPet)arr[0];
		IPet ii = (IPet)nabi;
		IPet iii = new GoldFish();
		
		IPet[] arr2 = {i, ii, iii};
		
		for(IPet myP : arr2) {
			System.out.print("IPet: ");
			myP.play();
		}
		
		PetHouse.print(i);
		
		System.out.println();
		PetHouse.print(arr2);
		
	}

}
