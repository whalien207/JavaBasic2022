package day1024day1025;


//Person value object (VO)
//dto(data transfer object : 데이터 전송 객체)
//ntt
public class PersonVO implements Comparable<PersonVO>{
	
	private int num;
	private String name;
	private int age;
	
	//매개변수가 없는 생성자 - default constructor
	public PersonVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	//속성을 전부 매개변수로 받는 생성자 - 인스턴스 생성 후 값을 빠르게 대입하기 위해서 생성
	public PersonVO(int num, String name, int age) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
	}
	
	//getter & setter : 속성의 값에 접근하고 변경하기 위한 method
	//일반적으로 VO 클래스의 경우 setter를 만들지 않음.
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	//데이터 출력을 편리하게 하기 위한 method
	//출력하는 method에 인스턴스 이름을 대입하면 이 method가 호출되서 출력된다.
	@Override
	public String toString() {
		return "PersonVO [num=" + num + ", name=" + name + ", age=" + age + "]";
	}

	//크기 비교하는 method : 정렬하기 위해서 사용
	
	@Override //매번 다르게 정렬은 불가능... 한가지로 지정한 정렬만 가능하다(이름/나이..등 중 한가지로만 정렬)
	public int compareTo(PersonVO o) {
		//*크기 비교 방법 설정 1. 나이순
		//return o.age - this.age; //내림차순
		//return -(this.age - o.age); //내림차순
		
		//return this.age - o.age; 오름차순
		
		//*크기 비교 방법 설정 2. 이름순
		return this.name.compareTo(o.name); // 오름차순
		//return o.name.compareTo(this.name); //내림차순
	}
}
