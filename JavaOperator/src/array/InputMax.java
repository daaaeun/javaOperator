package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : int형 배열에서 입력값 중 최댓값 구하기 
 * */

public class InputMax {
	public static void main(String[] args) {
		System.out.println("3개의 점수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		//배열선언 및 초기화
		//for-loop으로 입력
		//비교로직은 if문을 사용
		int result=0, max=0;

		int[] arr = new int[3];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
			if (arr[i]>max) {
				max=arr[i];
			}

		}
		System.out.println("최댓값 : "+ max);
/*
		if ((arr[0]>arr[1]) && (arr[0]>arr[2])) {
			result = arr[0];
		}
		else if ((arr[1]>arr[2]) && (arr[1]>arr[0])) {
			result = arr[1];
		}
		else if ((arr[2]>arr[0]) && (arr[2]>arr[1])) {
			result = arr[2];
		}
		else {
			System.out.println("동점이 있어요");
		}
		
		System.out.println(result);
*/		
		
	}
}