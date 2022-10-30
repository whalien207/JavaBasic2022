import java.util.Scanner;

public class Stamp10yen {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		/* x, y input값을 double로 변경 후 사용.
		int result = (int)Math.ceil((Y-X) / 10);
		System.out.println(result);
		*/
		
		int count = 0;
		for(int i = X; i < Y; i+=10) {
			count ++;
		}
		System.out.println(count);
		
		scan.close();
		
	}

}
