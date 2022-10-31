package day1028.nestedclass;

import java.util.Arrays;
import java.util.Comparator;

//method가 1개인 인터페이스
interface Sample{
	//추상 method 선언
	public void display();
}

//인터페이스를 구현한 클래스
class SampleImpl implements Sample{
	@Override
	public void display() {
		System.out.println("클래스를 만들어서 사용");
	}
}

public class AnonymousMain {
	
	public static void main(String[] args) {
		//인터페이스를 구현한 클래스의 인스턴스를 생성해서 매서드 호출
		//인스턴스를 여러개 만들어야 한다면 클래스를 만드는 것이 효율적
		Sample sample = new SampleImpl();
		sample.display();

		//Sample 인터페이스를 anonymous로 사용
		//인스턴스가 1개만 필요하다면 클래스를 만들지 않는 것이 효율적
		new Sample() {
			@Override
			public void display() {
				System.out.println("anonymous");
			}
		}.display();
		
		//배열의 정렬
		String[] ar = {"펄", "노트북", "고양이보은", "인사이드아웃", "미드소마"};
		
		//배열의 내림차순 정렬
		//Arrays.sort(배열, 비교를 위한 Comparator<T> 인터페이스를 구현한 클래스의 객체를 호출해야한다.
		//comparator는 method가 1개만 존재한다.(lambda가능)
		Arrays.sort(ar, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				//String이라 연산을 할수 없다. compareTo 사용.
				return o1.compareTo(o2);
			}
		});
		
		//배열의 요소를 빠르게 확인.
		System.out.println(Arrays.toString(ar));
		
	}
}
