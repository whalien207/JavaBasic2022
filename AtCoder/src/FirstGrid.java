import java.util.Scanner;

public class FirstGrid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();

		char[][] grid = new char[2][2];
		grid[0][0] = s1.charAt(0);
		grid[0][1] = s1.charAt(1);
		grid[1][0] = s2.charAt(0);
		grid[1][1] = s2.charAt(1);

		int row = grid.length;
		int col = grid[0].length;

		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				char me = grid[i][j];
				if(j+1 < col && me == grid[i][j+1]) {
					System.out.println("Yes");
					return;
				}
				if(i+1 < row && me == grid[i+1][j]) {
					System.out.println("Yes");
					return;
				}
			}
		}

		System.out.println("No");

		scan.close();
	}

}
