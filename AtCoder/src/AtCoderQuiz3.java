import java.util.Scanner;

public class AtCoderQuiz3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		if(42 <= N) {
			N += 1;
		}
		
		String n = Integer.toString(N);
		String result = "AGC";
		
		if(n.length() == 3) {
			result += n;
		}else if(n.length() == 2) {
			result += "0"+n;
		}else {
			result += "00"+n;
		}
		
		System.out.println(result);
		
		scan.close();
	}

}
