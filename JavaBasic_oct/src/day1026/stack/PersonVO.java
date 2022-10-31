package day1026.stack;

import java.util.Date;

//여러개의 값을 묶어서 표현하기 위한 클래스 - Value Object(VO)
//getter와 constructor는 만들지만 setter는 만들지 않는 경우가 많음.
public class PersonVO {
	
	//번호, 이름, 생일, 전화번호를 저장. + 닉네임, 자기소개
	private long num;
	private String name;
	private Date birthday; //java.util의 Date 사용
	private String phone;
	private String nick;
	private String intro;
	
	//매개변수가 없는 생성자 - default Constructor **기억해두기**
	//NoArgsContructor
	public PersonVO() {
		super();
	}
	
	//매개변수가 모두 있는 생성자 - 매게변수가 
	//method는 불릴때마다 stack을 만든다. 따라서 매개변수를 모두 받는 생성자로 셋팅하는게 훨씬 효율적인다.
	//AllArgsContructor
	public PersonVO(long num, String name, Date birthday, String phone, String nick, String intro) {
		super();
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.phone = phone;
		this.nick = nick;
		this.intro = intro;
	}
	
	//muterble(getter,setter둘다 만들기) / immuterble(setter를 안만듬)
	//Getter
	public long getNum() {
		return num;
	}

	public String getName() {
		return name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public String getPhone() {
		return phone;
	}

	public String getNick() {
		return nick;
	}

	public String getIntro() {
		return intro;
	}

	//값을 빠르게 확인하기 위한 메서드 = 디버깅을 위한 메서드 (개발 과정 중 값을 확인하기 위한 목적)
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", birthday=" + birthday + ", phone=" + phone + ", nick="
				+ nick + ", intro=" + intro + "]";
	}
	
	
	
}
