package operator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		/*
		 * 문제
		 * 스캐너로 두 값을 입력받아서 사칙연산 결과가 나오도록 하시오.
		 * ex) 20 + 7 = 27
		 *	   20 * 7 = 210 
		 * */
		
		//연산에 쓸 재료들을 준비하는 선언부
		Scanner scanner = new Scanner(System.in);
		
		int a=0, b=0, add=0, sub=0, mul=0, mok=0, nmg=0;
		//지역변수는 디폴트값으로 초기화
		
		//연산부
		System.out.println("a의 값을 적으시오.");
		a = scanner.nextInt();//next는 커서 다음 글자 or숫자를 변수에 할당하라는 의미 
		System.out.println("b의 값을 적으시오.");
		b = scanner.nextInt();
		
		//연산영역
		add = a+b;
		sub = a-b;
		mul = a*b;
		mok = a/b;
		nmg = a%b;
		
		//출력영역
		System.out.println(a+"+"+b+"=\t"+add);
		System.out.println(a+"-"+b+"=\t"+sub);
		System.out.println(a+"*"+b+"=\t"+mul);
		System.out.println(a+"/"+b+"=\t"+mok);
		System.out.println(a+"%"+b+"=\t"+nmg);
		
	}

}
