package day0926;

public class WhileEx07 {
	
	public static void main(String[] args) {
		//최대값을 찾아라~
		int[] arr = {50,30,40,60,70,90,100,110,20};
		
		int max = arr[0];//최대값을 저장할 변수
		int i = 0;
		while(i < arr.length) {
			//조건 -> arr[i]가 max 보다 크면 arr[i]를 max에게 저장
			if( max < arr[i]) {
				max = arr[i];
			}
			
			i++;
		}
		System.out.println("최대값: " + max);
		
		System.out.println("==================");
		//arr의 최소값을 찾아라.
		
		i = 0;
		int min = arr[0];
		while(i < arr.length) {
			if(arr[i] < min) {
				min = arr[i];
			}
			i++;
		}
		System.out.println("최소값: " + min);
		
		/* 간단하게 배열의 max값 구하기
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		*/
		
	}

}
