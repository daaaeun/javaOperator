package variable;

import java.util.Scanner;

public class InputTotal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//int kor=0, eng=0, math=0, total=0; //디폴트값 선언 : 지역변수 선언법
		//int kor, eng, math, total; // 인스턴스 변수 선언법
		
		// 연산부, 프로세싱
		System.out.println("국어 점수를 입력하세요!");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력하세요!");
		int eng = scanner.nextInt();
		System.out.println("수학 점수를 입력하세요!");
		int math =scanner.nextInt();
		//total 지역변수를 연산식으로 초기화함
		int total = kor + eng + math;
		
		//결과값 리턴
		System.out.println("총점 = "+total);
		int avg = total / 3;
		System.out.println("평균 = "+avg);
		
	
		
	}

}
