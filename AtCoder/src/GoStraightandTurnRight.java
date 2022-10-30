import java.util.Scanner;

public class GoStraightandTurnRight {
	
	static int x = 0;
	static int y = 0;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int str_len = Integer.parseInt(scan.nextLine());
		String input = scan.nextLine();
		
		//right > up > left > down 순으로 움직인다.
		String direction = "right";
		for(int i = 0; i < str_len; i++) {
			char event = input.charAt(i);

			if(event == 'R') { //방향바꾸기
				direction = switchDir(direction);
			}
			
			if(event == 'S') { //움직이기.
				move(direction);
			}
		}
		
		System.out.println(x+" "+y);
		
		scan.close();
		
	}
	
	public static String switchDir(String dir) {
		if(dir.equals("right")) {
			return "down";
		}else if(dir.equals("down")) {
			return "left"; 
		}else if(dir.equals("left")) {
			return "up"; 
		}else { //up
			return "right"; 
		}
	}
	
	public static void move(String dir) {
		if(dir.equals("right")) {
			x += 1;
		}else if(dir.equals("down")) {
			y -= 1;
		}else if(dir.equals("left")) {
			x -= 1;
		}else { //up
			y +=1;
		}
	}
	

}
