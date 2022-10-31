package day1027.charaterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

//파일에 문자 단위로 기록하고 읽어오기
public class CharaterFileMain {

	public static void main(String[] args) {
		//파일에 문자열을 문자 단위로 기록하기
		try {
			//버퍼를 이용해서 파일에 문자열을 기록하는 클래스의 인스턴스를 생성.
			//한번 기록하고 두번째 기록할 때 이어서 기록하는 인스턴스
			//true를 생략하고 false를 설정하면 파일의 내용을 항상 새로 작성한다.
			PrintWriter pw = new PrintWriter(new FileWriter("ch.txt", false));
			
			//문자열을 기록
			//문자열을 기록할 때 , 또는 공백, 탭 등으로 구분이 가능한데 이와 같이 만들어진 텍스트를 csv라고 한다.
			//이 방식은 변하지 않는 고정적인 데이터를 기록할 떄 주로 이용
			pw.print("민지, 뉴진스\n");
			pw.print("도영, NCT\n");
			pw.print("사쿠라, 르세라핌\n");
			
			//버퍼의 내용 전부 출력
			pw.flush();
			pw.close(); //닫기
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		//파일에서 문자열을 문자 단위로 읽어오기 : FileReader 와 BufferedReader 이용
		try {
			//FileReader fr = new FileReader("ch.txt");
			//BufferedReader br = new BufferedReader(fr);
			BufferedReader br = new BufferedReader(new FileReader("ch.txt"));
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				//읽은 데이터 출력
				//System.out.println(line);

				String[] ar = line.split(",");
				System.out.println(ar[0]);
				System.out.println(ar[1]);
			}
			
			br.close();
			//fr.close();
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}

	}

}
