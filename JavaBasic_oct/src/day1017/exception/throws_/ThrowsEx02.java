package day1017.exception.throws_;

public class ThrowsEx02 {
	
	//생성자
	public ThrowsEx02() throws Exception{
		System.out.println("생성자호출");
		aaa();
		System.out.println("생성자종료");
	}
	
	public void aaa() throws Exception{
		System.out.println("aaa시작");
		bbb(1);
		System.out.println("aaa종료");
	}
	
	public void bbb(int i ) throws Exception{
		System.out.println("bbb시작");

		/*
		try {
			System.out.println(i / 0); //예외
		} catch (Exception e) {
		}
		*/
		System.out.println(i / 0); //예외
		//throws로 예외를 떠넘기면 예외가 발생한 그 자리에서 method가 종료된다고 보면된다.
		
		System.out.println("bbb종료");
	}

}
