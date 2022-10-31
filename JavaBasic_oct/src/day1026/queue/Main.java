package day1026.queue;

import java.util.Comparator;
import java.util.Date;
import java.util.PriorityQueue;

import day1026.stack.PersonVO;

public class Main {

	public static void main(String[] args) {
		//PriorityQueue는 데이터를 정렬된 순서대로 꺼낼 수 있도록 해주는 클래스
		//List는 sort를 해주어야 하는데 알아서 정리를 해주니까 편함, 저장 속도는 조금 느릴수 있겠다. (내부적으로 비교를 하면서 정렬하여 저장하니까)
		
		//정수를 저장하는 PriorityQueue를 만들어서 출력
		PriorityQueue<Integer> intQueue = new PriorityQueue<>();
		
		//데이터 저장
		intQueue.offer(100);
		intQueue.offer(70);
		intQueue.offer(90);
		intQueue.offer(20);
		
		//데이터꺼내기
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll());
		System.out.println(intQueue.poll()); // 없으니 null (예외발생)
		
		
		//PersonVO 클래스를 저장하는 우선순위 Queue - 객체를 주면 항상 크기를 어떤것을 기준으로 할지 정해주어야 한다. 따라서 예외가 발생한다.
		/* 객체의 정렬은 크기 비교가 필수이다 */
		//PriorityQueue<PersonVO> persons = new PriorityQueue<>();

		/* 위의 예외를 해결하는 방법 2가지 */
		//방법1 - 위험한 방법
		//PersonVO 클래스에 Comparable 인터페이스를 implements하고
		//compareTo라는 method를 재정의해서 해결할 수 있고
		
		//방법2 - 선호하는 방법 
		//Comparator 인터페이스를 대입받을 수 있는 경우에는 Comparator 인터페이스를 구현한 클래스의 인스턴스를 이용해서 생성해도 된다.
		PriorityQueue<PersonVO> persons = new PriorityQueue<>(new Comparator<PersonVO>() {
			@Override
			public int compare(PersonVO o1, PersonVO o2) {
				return o1.getBirthday().compareTo(o2.getBirthday());
			}
		});
		
		persons.offer(new PersonVO(1, "사쿠라", new Date(100, 3, 11), "01033339999", "39saku", "르세라핌 입니다."));
		persons.offer(new PersonVO(2, "김채원", new Date(104, 5, 7), "01055555555", "cheachea", "르세라핌 입니다."));
		persons.offer(new PersonVO(3, "홍은채", new Date(97, 1, 3), "01088889999", "echea", "르세라핌 입니다."));
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		System.out.println(persons.poll());
		
	}
}
