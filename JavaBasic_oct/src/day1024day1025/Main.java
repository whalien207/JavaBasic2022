package day1024day1025;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		PersonVO[] persons = {
				new PersonVO(1, "수지", 29),
				new PersonVO(2, "아이유", 30),
				new PersonVO(3, "카리나", 23),
				new PersonVO(4, "아담", 46)
		};
		
		//*Arrays.sort method는 배열을 대입하면 부등호 또는 compareTo라는 method를 호출해서 크기를 비교한 후 정렬을 수행해준다.
		//PersonVO에는 크기비교를 할 수 있는 method가 존재하지 않아 error발생한다.
		// 크기비교하는 method를 만들어주면된다. Comparable interface에 존재.
		//interface는 메뉴판같은것이다. 
		//Arrays.sort(persons);
		
		//동적으로 크기 비교 하는 method를 설정
		/*
		Arrays.sort(persons, new Comparator<PersonVO>() {
			@Override
			public int compare(PersonVO o1, PersonVO o2) {
				return o1.getNum() - o2.getNum();
			}
		});
		*/
		
		
		/*
		 * 동적으로 정렬하기
		 * 1. 이름의 오름 2. 이름의 내림 3.나이의 오름 4. 나이의 내림
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("<어떤 방식으로 정렬을 원하시나요?>");
		System.out.println("1. 이름의 오름차순 2. 이름의 내림차순 3.나이의 오름차순 4. 나이의 내림차순");
		
		System.out.print("input number > ");
		String menu = scan.nextLine();
		switch(menu.trim()) {
			case "1":
				Arrays.sort(persons, new Comparator<PersonVO>() {
					public int compare(PersonVO o1, PersonVO o2) {
						return o1.getName().compareTo(o2.getName());
					}
				});
				break;
			case "2":
				Arrays.sort(persons, new Comparator<PersonVO>() {
					public int compare(PersonVO o1, PersonVO o2) {
						return o2.getName().compareTo(o1.getName());
					}
				});
				break;
			case "3":
				Arrays.sort(persons, new Comparator<PersonVO>() {
					public int compare(PersonVO o1, PersonVO o2) {
						return o1.getAge() - o2.getAge();
					}
				});
				break;
			case "4":
				Arrays.sort(persons, new Comparator<PersonVO>() {
					public int compare(PersonVO o1, PersonVO o2) {
						return o2.getAge() - o1.getAge();
					}
				});
				break;
			default:
				System.out.println("메뉴는 1-4번만 선택하세요");
				break;
		}
		scan.close();
		
		//배열의 데이터 출력
		//*Arrays.toString은 배열의 각 요소의 toString을 전부 호출해서 하나의 문자열로 리턴하는 method입니다.
		System.out.println(Arrays.toString(persons));
	}

}
