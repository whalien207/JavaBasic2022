package day1007.this_;

public class Person { //부모 클래스 사용
	
	//employee , student, teacher에 중복되는 부분을 person부모 클래스에 정의했다.
	String name;
	int age;
	
	Person(){
		this("기본인", 1);// 아래 생성자로 연결 ( 생성자의 연결 )
		/* 위처럼 한줄만 써줄수도 있다.
		this.name = "기본인";
		this.age = 1;
		*/
	}
	
	Person(String name){ // 아래 생성자로 연결
		this(name, 1);
	}
	
	Person(String name, int age){
		this.name = name.toUpperCase();
		this.age = age;
		//System.out.println("100줄 짜리 코드...");
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}

}
