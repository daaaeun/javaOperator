package loop;

/*
* @ Date : 2015.07.10
* @ Author : me
* @ Story : for-loop을 활용한 1부터 10까지 합
* */

public class ForLoopSum {
	public static void main(String[] args) {
		// 현재 지변을 초기화 하지 않는 이유는
		// for-loop 내부에서 하고있기 때문
		int sum=0;
		for (int i = 1; i <= 10; i++) {
			sum += i; //sum = sum+i;
					 // i값이 회전하면서 증가하는 값을 누적시키는 연산
		}
		System.out.println("1부터 10까지의 합은 "+sum+"입니다.");
	}

}
