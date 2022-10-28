package day1018.api.lang.object;

public class Person /*extends Object*/{

	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	//overriding - toString
	//generate toString (alt+shift+s)
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

	//Overriding / Implement method (alt+shift+s)
	//멤버변수 명이 같으면 true return되도록...
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person p = (Person)obj;
			String n = p.getName();
			
			if(n.equals(this.name)) {
				System.out.println("이름이 같음");
				return true;
			}
		}
		return false;
	}

	//clone method를 사용하고 싶다면 override
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
	
	
}
