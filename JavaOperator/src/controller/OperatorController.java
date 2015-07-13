package controller;

import condition.ArithmeticCalc;
import condition.CalcAvg;
import condition.ManOrWoman;
import condition.SwitchAvg;
import loop.EvenOddSum;


/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : 
 * */

public class OperatorController {
	public static void main(String[] args) {
		// 2015.07.09 성적계산기
		CalcAvg avg = new CalcAvg();
	//	avg.calcAvg();
		
		//2015.07.09 사칙연산 계산기
		ArithmeticCalc calc = new ArithmeticCalc();
	//	calc.calc();
		
		//2015.07.10 스위치 성적계산기
		SwitchAvg avg2 = new SwitchAvg();
	//	avg2.calc();
		ManOrWoman manOrWoman = new ManOrWoman();
	//	manOrWoman.ssn(); // ssn() 원 클래스의 메소드 이름이다.

		//2015.07.13 짝수/홀수 합 계산기
		
		EvenOddSum evenOddSum = new EvenOddSum();
		evenOddSum.calc();
	}

}
