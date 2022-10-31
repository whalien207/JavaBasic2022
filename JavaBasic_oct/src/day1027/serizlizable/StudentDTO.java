package day1027.serizlizable;

import java.io.Serializable;
import java.util.Date;

//인스턴스 단위로 읽고 쓰기가 가능한 클래스 - Serializable interface 때문
public class StudentDTO implements Serializable{

	private int num;
	private String name;
	private Date birthday;
	private String group;
	
	public StudentDTO() {
		super();
		
	}
	
	public StudentDTO(int num, String name, Date birthday, String group) {
		super();
		this.num = num;
		this.name = name;
		this.birthday = birthday;
		this.group = group;
	}


	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return "StudentDTO [num=" + num + ", name=" + name + ", birthday=" + birthday + ", group=" + group + "]";
	}
	
}
