package ifCondition;

import java.util.Scanner;

/*
 * @ Date : 2015.07.09
 * @ Author : me
 * @ Story : if-else 예제
		프로그램을 하나 개발해야 합니다.
		오더는
		학생		국어		영어		수학		총점		평균		합격여부
	  ---------------------------------------------------------
	  (홍길동)	(90)	(90)	(80)	(270)	(90)	(장학생)
	  
	  평균이 90점 이상이면 장학생
	  평균이 70점 이상 - 90점 미만이면 합격
	  평균이 70점 미만이면 불합격

 * */


public class CalcAvgMain {
	public static void main(String[] args) {
/*
		int kor=0, eng=0, math=0, total=0, avg=0;
		String student;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("학생의 이름을 쓰시오 : ");
		student = scanner.next();
		
		System.out.println("국어 점수를 입력하시오 : ");
		kor = scanner.nextInt();
		
		System.out.println("영어 점수를 입력하시오 : ");
		eng = scanner.nextInt();
		
		System.out.println("수학 점수를 입력하시오 : ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = total / 3;
		
		if (avg >= 90) {
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
			System.out.println("-------------------------------------------------------");
			System.out.println(student+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t장학생");
		}
		
		else if (avg >=70 && avg<90) {
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
			System.out.println("-------------------------------------------------------");
			System.out.println(student+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t합격");
			
		}
		
		else {
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
			System.out.println("-------------------------------------------------------");
			System.out.println(student+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t불합격");
		}
		
*/
	// 강사님 답
		
		//선언부
		String student="",msg="";
		
		//점수는 연산을 해야되서 int 타입으로 정해져야 한다.
		int kor=0, eng=0, math=0, total=0, avg=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름 : ");
		student = scanner.next();
		System.out.println("국어 : ");
		kor = scanner.nextInt();
		System.out.println("영어 : ");
		eng = scanner.nextInt();
		System.out.println("수학 : ");
		math = scanner.nextInt();
		
		total = kor + eng + math;
		avg = (int)total /3; //다운캐스팅, 소수점 이하 버림 
		
		//연산부
		if (avg >= 90) {
			msg = "장학생";
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
			System.out.println("-------------------------------------------------------------");
			System.out.println(student+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+msg);
		}
		
		else if ((avg >=70) && (avg<90)) {
			msg = "합격";
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
			System.out.println("-------------------------------------------------------------");
			System.out.println(student+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+msg);	
		}
		
		else {
			msg = "불합격";
			System.out.println("학생\t국어\t영어\t수학\t총점\t평균\t합격여부");
			System.out.println("-------------------------------------------------------------");
			System.out.println(student+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg+"\t"+msg);				
		}

	}

}

