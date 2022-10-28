package day1017.exception.throws_;

public class ThrowsEx01 {
	
	public static void main(String[] args) {
		
		//method에서 예외처리 - throws
		//throws 구문이 붙어있는 method or 생성자를 호출할 때는 예외를 대신 처리해야 한다.
		//즉, method안에서 예외처리를 강요할 때 사용한다.
		/*
		greeting(0);
		greeting(1);
		greeting(2);
		greeting(3);
		greeting(4);
		*/
		
		/* greeting throws method */
		try {
			greeting(0);
			greeting(1);
			greeting(2);
			greeting(3);
			greeting(4);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("배열범위에서 벗어남");
		}
		
		System.out.println("----------------------------------------------");
		
		/* calc throws method */
		try {
			calc(1);
			calc(35);
			calc(3);
			calc(0);
			
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다");
		}
		
		try {
			greeting(5);
		} catch (Exception e) {
			//예외처리를 하면 예외의 내용을 알수가 없기때문에,  
			// 예외의 내용을 확인하기 위해서 catch 영역에서는 항상 사용한다. 
			e.printStackTrace();
		}
		System.out.println("프로그램 정상종료");
	}

	//static variable
	private static String[] arr = {"안녕하세요", "hello", "니하오", "곤니찌와"};
	//static method
	public static void greeting(int index) throws Exception{
		System.out.println(arr[index]);
	}
	
	public static void calc(int num) throws ArithmeticException{
		System.out.println(10 / num);
	}
}
