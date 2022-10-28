package day1012.quiz;

public class Main {
	
	public static void main(String[] args) {
		
		Computer com = new Computer();
		Radio radio = new Radio();
		Tv tv = new Tv();
		
		MyCart cart = new MyCart(5000);
		//cart.buy(com);
		//cart.info();
		cart.buy(com);
		cart.buy(com);
		cart.buy(tv);
		cart.buy(com);
		cart.buy(radio);
		cart.buy(radio);
		cart.buy(radio);
		cart.buy(tv);
		cart.buy(tv);
		cart.buy(tv);
		cart.buy(tv);
		
		}
}
