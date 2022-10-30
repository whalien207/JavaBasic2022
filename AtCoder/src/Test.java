import java.util.Arrays;
import java.util.Scanner;
 
public class Test {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String row = scan.nextLine();
		int n =Integer.parseInt(row);
		
		String result="No";
		String[][] str = new String[n][2];
		for(int i=0;i<n;i++) {
			String st =scan.nextLine();
			String s =st.split(" ")[0];
			String t =st.split(" ")[1];
			str[i][0]=s;
			str[i][1]=t;
		}
		
		
		int count1=0;
		int count2=0;
		boolean b1 = false;
		boolean b2 = false;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(str[i][0].equals(str[j][0]) || str[i][0].equals(str[j][1])) {
					count1++;
					b1 = true;
				}
				
				if(str[i][1].equals(str[j][0]) || str[i][1].equals(str[j][1])) {
					count2++;
					b2 = true;
				}
				
			}
		}
		
		if(count1==0||count2==0) {
			result="Yes";
		}
		
		if(b1 )
		
		System.out.println(result);
	}
 
}