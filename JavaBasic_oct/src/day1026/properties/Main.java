package day1026.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		//프로퍼티스 인스턴스 생성
		Properties properties = new Properties();
		//없는 key를 사용하면 null return 
		System.out.println(properties.getProperty(""));
		
		properties.setProperty("아담", "한국 최초의 사이버 가수");
		properties.setProperty("강진축구", "세계 최초의 온라인 축구 게임");
		properties.setProperty("프리스톤테일", "한국 최초의 자체 3D 엔진 MMORPG");
		
		//텍스트 파일로 저장
		//다른 언어는 예외처리는 개발자 마음대로 해도 된다.
		//java는 java가 만들지 않은 것들은 무조건 예외처리를 하도록 강제하고 있다.
		// 1) DB작업 / 2) 파일작업 3) 다른 server와의 통신 (try catch를 사용해주면 좋다)
		
		try {
			//현재 작업 디렉토리에 파일로 저장
			//git을 연결한 경우 C 드라이브 > user > git dir > 파일 디렉토리 안에 있다.
			//properties.store(new FileOutputStream("./myproject.properties"), "텍스트로 저장");
			properties.storeToXML(new FileOutputStream("./myxml.xml"), "xml로 저장");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
