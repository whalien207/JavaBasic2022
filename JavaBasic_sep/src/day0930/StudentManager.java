package day0930;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
		/*
		index를 이동해서 회원정보를 출력하는 프로그램 입니다.
		index의 시작은 -1에서 시작하고
		입력이 될떄마다 count를 증가시켜주면 됩니다.
		 */
		Scanner scan = new Scanner(System.in);
		String[] nameList = new String[100];
		String[] genderList = new String[100];
		String[] emailList = new String[100];
		int[] ageList = new int[100];

		LocalDate now = LocalDate.now();
		int nowyear = now.getYear();

		//현재 고객수가 몇명이 저장 되었는지 알기 위한 변수 count선언
		int count = 0;
		//index를 조정할 변수 선언
		int index = -1;

		loop:while(true) {

			System.out.println("[Info]-고객수:" + count + ", 현재위치:" + index);
			System.out.println("[메뉴]1.Insert, 2.Prev, 3.Next, 4.Current, 5.Update, 6.Delete, 7.Quit");
			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.println("==========고객정보 입력을 시작합니다==========");
				/*
				이름, 성별, 이메일, 출생년도 를 입력받아서 각각 배열에 저장
				사람 수를 증가 시킨다.
				 */
				index = count; //인덱스 증가
				System.out.print("이름>");
				String name = scan.next();
				nameList[index] = name;

				System.out.print("성별(여/남)>");
				String gender = scan.next();
				genderList[index] = gender;

				System.out.print("이메일>");
				emailList[index] = scan.next();

				System.out.print("출생년도(YYYY)>");
				int birthyear = scan.nextInt();
				ageList[index] = (nowyear - birthyear) + 1;

				count ++;//회원수 증가.

				System.out.println("=======================================");

				break;
			case 2:
				System.out.println("==========이전 고객정보를 출력합니다==========");
				/*
				 * index가 0이하라면 "이전 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 이전고객 정보를 출력하면 됩니다.
				 */

				if(index <= 0) {
					System.out.println("이전 고객정보가 없습니다.");
				}else {
					index --;
					System.out.println("이름:" + nameList[index]);
					System.out.println("성별:" + genderList[index]);
					System.out.println("이메일:" + emailList[index]);
					System.out.println("나이:" + ageList[index]);
				}

				System.out.println("=======================================");

				break;
			case 3:
				System.out.println("=========다음 고객정보를 출력합니다===========");

				/* index를 이전으로 이동하고 다음고객정보를 출력합니다.
				 * 다음 고객정보를 출력할 수 없는 조건을 생각해서 "다음 고객정보가 없습니다"
				 * 그렇지 않으면 index를 이동해서 다음고객 정보를 출력하면 됩니다.
				 */

				//index+1이 고객수랑같은 경우 next없음 
				if(count <= index+1) {
					System.out.println("다음 고객정보가 없습니다.");
				}else {
					index ++;
					System.out.println("이름:" + nameList[index]);
					System.out.println("성별:" + genderList[index]);
					System.out.println("이메일:" + emailList[index]);
					System.out.println("나이:" + ageList[index]);
				}

				System.out.println("=======================================");

				break;
			case 4:
				System.out.println("=========현재 고객정보를 출력합니다===========");
				/* 현재 index의 위치의 고객정보를 출력합니다.
				 * 현재정보를 출력할수 있는 조건을 생각해서 현재 정보를 출력하면 됩니다.
				 * 그렇지 않으면 "현재 고객정보가 없습니다" 를 출력하면 됩니다
				 * 
				 */
				if(index < 0) {
					System.out.println("현재 고객정보가 없습니다.");
				}else {
					System.out.println("이름:" + nameList[index]);
					System.out.println("성별:" + genderList[index]);
					System.out.println("이메일:" + emailList[index]);
					System.out.println("나이:" + ageList[index]);
				}
				
				System.out.println("=======================================");


				break;
			case 5:
				System.out.println("=========현재 고객정보를 수정합니다============");
				/* 현재 index의 위치의 고객정보를 수정합니다.
				 * 현재정보를 출력할수 있는 조건을 생각해서 
				 * 스캐너를 통해서 순서대로 이름, 성별, 나이를 입력받아서 배열의 값을 수정하세요. 
				 * 
				 * 그렇지 않으면 "수정할 데이터가 없습니다" 를 출력하면 됩니다
				 */
				if(index < 0) {
					System.out.println("수정할 데이터가 없습니다.");
				}else {
					System.out.print("수정할 고객 이름을 입력해주세요>");
					String update_name = scan.next();
					
					//만약 중복된 고객 이름이 있다면. 출력하고 선택하여 수정하도록 함.
					int[] overlap_index = new int[count];
					int arr_index = 0;
					int overlap_count = 0;
					for(int i = 0; i < count; i++) { // 고객수 만큼 for문을 돌면서
						if(update_name.equals(nameList[i])) {//입력한 이름과 같다면
							overlap_index[arr_index++] = i;
							System.out.printf("%d. %s %d\n", overlap_count++, nameList[i], ageList[i]);
						}
					}
					
					System.out.print("삭제할 사람을 선택하세요>");
					int update = scan.nextInt();
					int update_index = overlap_index[update];
					
					//수정하기 전 선택한 고객 정보 출력
					System.out.println("=========수정 할 고객 정보입니다.============");
					System.out.println("이름:" + nameList[update_index]);
					System.out.println("성별:" + genderList[update_index]);
					System.out.println("이메일:" + emailList[update_index]);
					System.out.println("나이:" + ageList[update_index]);
					System.out.println("=======================================");
					
					//선택한 항목만 수정하도록 하였다.
					System.out.println("수정할 정보를 입력해주세요");
					System.out.println("1. 이름 2. 성별 3. 이메일 4. 나이");
					System.out.print(">");
					int choice_update = scan.nextInt();
					
					switch(choice_update) {
					case 1:
						System.out.print("이름>");
						nameList[update_index] = scan.next();
						break;
					
					case 2:
						System.out.print("성별>");
						genderList[update_index] = scan.next();
						break;
						
					case 3:
						System.out.print("이메일>");
						emailList[update_index] = scan.next();
						break;
						
					case 4:
						System.out.print("나이>");
						birthyear = scan.nextInt();
						ageList[index] = (nowyear - birthyear) + 1;
						break;
					default:
						System.out.println("잘못된 입력입니다.");
						break;
					}
					
					/* 현재 위치한 index의 정보를 수정하는 코드
					System.out.println("=========수정 할 고객 정보입니다.============");
					System.out.println("이름:" + nameList[index]);
					System.out.println("성별:" + genderList[index]);
					System.out.println("이메일:" + emailList[index]);
					System.out.println("나이:" + ageList[index]);
					System.out.println("=======================================");

					System.out.print("이름>");
					name = scan.next();
					nameList[index] = name;

					System.out.print("성별(여/남)>");
					gender = scan.next();
					genderList[index] = gender;

					System.out.print("이메일>");
					emailList[index] = scan.next();

					System.out.print("출생년도(YYYY)>");
					birthyear = scan.nextInt();
					nowyear = now.getYear();
					ageList[index] = (nowyear - birthyear) + 1;
					*/
				}

				System.out.println("=======================================");

				break;
			case 6:
				System.out.println("=========현재 고객정보를 삭제합니다============");
				/* 현재 index의 위치의 고객정보를 삭제합니다.
				 * 현재정보를 삭제할 수 있는 조건을 생각해서
				 * 현재 index부터 ~~뒤에 있는 배열요소를 당겨와서 덮어 씌웁니다.
				 * 고객수 를 감소시킵니다.
				 * 
				 * 그렇지 않으면 "삭제할 데이터가 존재하지 않습니다" 를 출력하면 됩니다
				 * 
				 */
				if(index < 0) {
					System.out.println("삭제할 데이터가 존재하지 않습니다.");
				}else {
					System.out.println("=========삭제 할 고객 정보입니다.============");
					System.out.println("이름:" + nameList[index]);
					System.out.println("성별:" + genderList[index]);
					System.out.println("이메일:" + emailList[index]);
					System.out.println("나이:" + ageList[index]);
					System.out.println("=======================================");

					//삭제할 현재 배열부터 ~ 다음 배열에 들어있는 고객정보로 덮어 쓰기
					for(int i = index; i < count-1; i++) {
						nameList[i] = nameList[i+1];
						genderList[i] = genderList[i+1];
						emailList[i] = emailList[i+1];
						ageList[i] = ageList[i+1];
					}
					count --; // 고객수 감소

				}

				System.out.println("=======================================");
				break;

			case 7:
				System.out.println("프로그램을 종료합니다");
				/* 
				 * 무한루프를 완전히 탈출 
				 */
				scan.close();

				break loop;
			default:
				System.out.println("메뉴를 잘못 입력했습니다.");

				break;
			}

		}

	}
}
