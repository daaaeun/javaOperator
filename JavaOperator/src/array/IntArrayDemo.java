package array;

import java.util.Scanner;

/*
 * @ Date : 2015.07.13
 * @ Author : me
 * @ Story : int 배열
 * */

public class IntArrayDemo {
	public static void main(String[] args) {
		//선언부
		//변수의 선언
		//지역변수는 무조건 초기화 해야한다.
		//그런데 변수 하나 하나 초기화 하려다 보니
		//3~4개는 해볼만 하고 더이상은....
		int[] arr; //숫자형 배열의 선언
		arr = new int[100000];
		
		//위 문장을 하나로 합치면 아래와 같다.
		int[] arr2 = new int[100000];
		Scanner scanner = new Scanner(System.in);
		
		/*
		 자바는 객체지향 언어
		 이 말은 프로그램 모양을 객체화 시켜서 사용한다는 뜻과 동일
		 그럼 객체화 시킨다는 말이란
		 좁은 의미에서 보자면 main() 해체하고
		 단 하나의 main() 만 프로그램에서 존재시키고
		 나머지는 클래스화 하여 필요할 때에만 호출하는 방법은 공식적으로 굳어졌는데
		 클래스이름 객체이름 = new 클래스이름();
		 -- ()안에 있는 변수는 파라미터라고 하는데
		 -- 필요에 따라 있을 수도 없을 수도 있다.
		 -- 단, 클래스이름, 객체이름, new, 클래스이름()는 반드시 필요
		 -- 그리고 이때 객체이름을 참조변수라고 한다.
		
		 */
		
		
	}
	

}
