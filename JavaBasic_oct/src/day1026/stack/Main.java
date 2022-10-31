package day1026.stack;

import java.util.Date;
import java.util.Stack;

public class Main {
	
	public static void main(String[] args) {
		
		//PersonVO 클래스의 인스턴스를 저장할 수 있는 stack을 생성
		Stack <PersonVO> stack = new Stack<>();
		stack.push(new PersonVO(1, "사쿠라", new Date(100, 3, 11), "01033339999", "39saku", "르세라핌 입니다."));
		stack.push(new PersonVO(2, "김채원", new Date(104, 5, 7), "01055555555", "cheachea", "르세라핌 입니다."));
		//PersonVO p = new PersonVO();
		
		//stack이므로 pop시 2번 -> 1번 순서로 나온다.
		System.out.println(stack.pop());
		System.out.println(stack.pop()); 
		
		//data가 2개 존재, 2번 pop하면 모두 제거된 상태로 빈stack의 상태인데 꺼낼것이 없어서 underflow 발생
		//System.out.println(stack.pop());
	}

}
