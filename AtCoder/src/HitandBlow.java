import java.util.Scanner;

public class HitandBlow {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		String A = scan.nextLine();
		String B = scan.nextLine();
		
		int[] Ai = new int[N];
		int[] Bi = new int[N];
		
		//배열에 담기.
		for(int i = 0; i < N; i++) {
			Ai[i] = Integer.parseInt(A.split(" ")[i]);
			Bi[i] = Integer.parseInt(B.split(" ")[i]);
		}
		
		int same = 0;
		int diff = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(Ai[i] == Bi[j]) {
					if(i == j) {
						same++;
					}else {
						diff++;
					}
				}
			}
		}
		
		System.out.println(same);
		System.out.println(diff);
		
		scan.close();
	}

}
