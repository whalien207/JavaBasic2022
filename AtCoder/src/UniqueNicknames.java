import java.util.Scanner;

public class UniqueNicknames {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int range = scan.nextInt();
		String[] s = new String[range];
		String[] t = new String[range];
		
		for(int i = 0; i < range; i++) {
			s[i] = scan.next();
			t[i] = scan.next();
		}
		
		boolean overlap_s = false;
		boolean overlap_t = false;
		for(int i = 0; i < range-1; i++) {
			for(int j = i+1; j < range; j++) {
				if(s[i].equals(s[j]) || s[i].equals(t[j])) {
					overlap_s = true;
				}
				if(t[i].equals(s[j]) || t[i].equals(t[j])) {
					overlap_t = true;
				}
			}
		}
		
		if(!overlap_s || !overlap_t) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scan.close();
	}

}
