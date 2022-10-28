package day1017.exception.throw_;

public class ThrowEx01 {
	
	public static void main(String[] args) {
		
		try {
			System.out.println(calc(10));
			System.out.println(calc(-10));
		} catch (Exception e) {
			e.printStackTrace(); //예외의 내용을 로그로 출력해주는 기능.
			System.out.println(e.getMessage()); //예외 생성시에 만들어진 메세지를 확인할 수 있음.
		}
	}
	
	//잘못된 값이 전달되면 예외를 만들어서 method를 강제종료
	public static int calc(int n) throws Exception{
		
		if(n <= 0) {
			throw new Exception("0이상으로 값을 전달하세요"); // 예외 강제 생성 - 예외를 생성하면 예외처리 구문이 필요하다.
			//return; 무조건 int형으로 값을 반환해 줘야해서 return을 종료를 시킬수 없다. 따라서 throw 키워드로 강제로 예외를 만들어서 종료시킨다.
		}
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

}
