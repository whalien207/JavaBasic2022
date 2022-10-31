package day1027.serizlizable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class Main2 {
	
	public static void main(String[] args) {
		
		//따로 close를 해주지 않아도 자동적으로 close하도록 하는 기능.
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("try&resource.txt"));){
			
			//기록할 인스턴스 생성
			StudentDTO dto = new StudentDTO(1, "사쿠라", new Date(), "르세라핌");
			StudentDTO dto1 = new StudentDTO(2, "민지", new Date(), "뉴진스");
			
			//기록할 인스턴스가 여러개 이므로 하나의 List로 묶어줍니다. (write는 한번만 해주어야 한다.)
			ArrayList<StudentDTO> list = new ArrayList<>();
			list.add(dto);
			list.add(dto1);
			//기록
			oos.writeObject(list);
		 
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("try&resource.txt"));){
			//인스턴스 단위에 파일에 읽어낼 수 있는 객체를 생성
			
			ArrayList list = (ArrayList)ois.readObject();
			
			for(Object obj : list) {
				System.out.println(obj);
			}
			
			//하나의 데이터 읽어오기
			//StudentDTO dto = (StudentDTO) ois.readObject();
			//System.out.println(dto);
			
		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}

}
