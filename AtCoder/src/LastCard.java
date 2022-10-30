import java.util.Scanner;

public class LastCard {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int A = scan.nextInt();
		
		int card_count = 1;
		int p = A;
		while(card_count < K) {
			//System.out.println("p"+p+" "+"count:"+card_count);
			if(p == N){
				p=1;
				card_count++;
				continue;
			}
			p ++;
			card_count++;
		}
		
		System.out.println(p);
		
		scan.close();
	}

}
