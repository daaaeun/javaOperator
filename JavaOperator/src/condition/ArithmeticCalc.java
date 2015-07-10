package condition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : 사칙연산 계산 프로그램
 * 
 * 오더
 -사칙연산 계산기
 -덧셈, 뺄셈, 곱셈, 나눗셈(몫 : (), 나머지 : ())
 -사칙연산 기호도 입력받습니다. +,-,*,/
 -출력결과
 -===심플 계산기===
 - 5 X 5 = 25
 - 5 + 5 = 10
 - 6 ÷ 5 = 1(1)
 - 5 - 6 = -1
 * */

public class ArithmeticCalc {
	public void calc(){
		Scanner scanner = new Scanner(System.in);

/*		
		int add=0, sub=0, mul=0, div=0, nmg=0, a=0, b=0, result=0;
		String c="";
		
		System.out.println("첫번째 숫자 입력 : ");
		a = scanner.nextInt();
		
		System.out.println("원하는 사칙연산 입력 : ");
		c = scanner.next();
		
		System.out.println("두번째 숫자 입력 : ");
		b = scanner.nextInt();
					
		add = a+b;
		sub = a-b;
		mul = a*b;
		div = a/b;
		nmg = a%b;
			
		System.out.println("===심플계산기===");
		if (c.equals("+")) {
			System.out.println(a+"+"+b+"="+add);
		}
		else if (c.equals("-")) {
			System.out.println(a+"-"+b+"="+sub);
		}	
		else if (c.equals("*")) {
			System.out.println(a+"x"+b+"="+mul);
		}
		else if (c.equals("/")) {
			System.out.println(a+"÷"+b+"="+div+"("+nmg+")");
		}
		else {
			System.out.println("입력된 값이 올바르지 않습니다.");
		}
*/
		int a=0, b=0, result=0, nmg=0;
		String c="";
		
		System.out.println("첫번째 숫자 입력 : ");
		a = scanner.nextInt();
		
		System.out.println("원하는 사칙연산 입력 : ");
		c = scanner.next();
		
		System.out.println("두번째 숫자 입력 : ");
		b = scanner.nextInt();
		
	//연산부
		if (c.equals("+")) {
			result = a+b;
		}
		else if (c.equals("-")) {
			result = a-b;
		}
		else if (c.equals("*")) {
			result = a*b;
		}
		else if (c.equals("/")) {
			result = a/b;
			nmg = a%b;
		}
		else {
			System.out.println("입력된 값이 올바르지 않습니다.");
		}
	//출력부
		System.out.println("===심플계산기===");
		System.out.println(a+c+b+"="+result+"("+nmg+")");
		
	}
}
