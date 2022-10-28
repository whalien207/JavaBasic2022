package day0922;

public class IfEx {
	public static void main(String[] args) {
		
		//0~100까지 랜덤값
		int point = (int)(Math.random() * 101);
		
		System.out.println("점수: " + point);
		
		//점수가 60이상이라면 합격/불합격
		if( point >= 60 ) {
			System.out.println("60점 이상입니다.");
			System.out.println("합격입니다.");
		} else {
			System.out.println("불합격입니다.");
		}
		
		/* else구문으로 대체 가능.
		if (point < 60) {
			System.out.println("60점 미만입니다.");
			System.out.println("불합격입니다.");
		}
		*/
	}
}
