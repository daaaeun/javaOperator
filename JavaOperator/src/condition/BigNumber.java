package condition;

/*
* @ Date : 2015.07.10
* @ Author : me
* @ Story : if-else 예제(큰 수 구하기)
* */

import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {
		/*
		 문제)
		학생 3명의 점수를 입력받아서 1등 출력 (0점~100점)		 
		 결과) 
		1등은 홍길동이며 98점입니다.
		 힌트)
		a 와 b, b 와 c, a 와 c를 비교 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		int a=0, b=0, c=0, result=0;
		
/*		for (int i = 0; i < 3; i++) {
			System.out.println("학생"+(i+1)+"의 점수를 입력하세요");
			
			a = scanner.nextInt();
			}
*/

		System.out.println("학생1의 점수을 입력하세요");
		a = scanner.nextInt();
		
		System.out.println("학생2의 점수을 입력하세요");
		b = scanner.nextInt();
		
		System.out.println("학생3의 점수을 입력하세요");
		c = scanner.nextInt();
		
		if (a>b && a>c) {
			result = a;
		}
		else if (b>a && b>c) {
			result = b;
		}
		else if (c>a && c>b) {
			result = c;
		}
		else {
			System.out.println("동점자가 존재합니다.");
		}
		System.out.println("1등은"+result+"점입니다.");

		
	}

}