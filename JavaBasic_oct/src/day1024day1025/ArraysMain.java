package day1024day1025;

import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		String[] lesserafim = {"사쿠라","김채원","허윤진","카즈하","홍은채"};
		
		int result = Arrays.binarySearch(lesserafim, "카즈하");
		System.out.println(result);
		
		Arrays.sort(lesserafim);
		System.out.println(Arrays.toString(lesserafim));
		result = Arrays.binarySearch(lesserafim, "카즈하");
		if(result >= 0) {
			System.out.printf("%s 는 %d 번째 존재\n", "카즈하", result);
		}else {
			System.out.printf("%s는 존재하지 않음\n", "카즈하");
		}
	}

}
