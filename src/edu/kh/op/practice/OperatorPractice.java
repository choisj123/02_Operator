package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		/*모든 사람이 사탕을 골고루 나눠가지려고 한다. 
		 * 인원 수와 사탕 개수를 키보드로 입력 받고
			1인당 동일하게 나눠가진 사탕 개수와 나눠주고 
			남은 사탕의 개수를 출력하세요
			[실행화면]
			인원 수 : 29
			사탕 개수 : 100
			1인당 사탕 개수 : 3
			남는 사탕 개수 : 13 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수: ");
		int input = sc.nextInt();
		
		System.out.print("사탕 개수: ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수: " + (candy / input));
		System.out.println("남는 사탕 개수: " + (candy % input));
		
		
	}

	public void practice2() {
		/*이름 : 홍길동
		학년(정수만) : 3
		반(정수만) : 4
		번호(정수만) : 15
		성별(남학생/여학생) : 남학생
		성적(소수점 아래 둘째 자리까지) : 85.75
		3학년 4반 15번 홍길동 남학생의 성적은 85.75이다
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		
		System.out.print("학년(정수만): ");
		int grade = sc.nextInt(); 
		
		System.out.print("반(정수만): ");
		int classRoom = sc.nextInt(); 
		
		System.out.print("번호(정수만): ");
		int number = sc.nextInt(); 
		
		System.out.print("성별(남학생/여학생): ");
		String gender = sc.next(); 
		
		System.out.print("성적(소수점 아래 둘째 자리까지): ");
		double score = sc.nextDouble(); 
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점이다", grade, classRoom, number, name, gender, score );		
				
	}
	
	public void practice3() {
		/*국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
		[실행화면]
		국어 : 60
		영어 : 80
		수학 : 40
		합계 : 180
		평균 : 60.0 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int korean = sc.nextInt();
		
		System.out.print("영어: ");
		int english = sc.nextInt();
		
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int sum = korean + english + math ; //합계
		double avg = sum / 3.0; //평균
		
		System.out.println("합계: " + sum);
		System.out.printf("평균: %.1f", avg);
		//System.out.printf(" 국어: %d\n 영어: %d\n 수학: %d\n 합계: %d\n 평균: %.2f\n ", korean, english, math, sum, avg);

		boolean result = (korean >=40) && (english >=40) && (math >=40) && (avg >= 60);
		
		System.out.println();
		System.out.println(result ? "합격" : "불합격");
		//조건식 ? 식1 : 식2
		
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수1 : ");
		int score1 = sc.nextInt();
		
		System.out.print("점수2 : ");
		int score2 = sc.nextInt();
		
		System.out.print("점수3 : ");
		int score3 = sc.nextInt();
		
		int sum = score1 + score2 + score3 / 3;
		
		
		//score1 >= 40 && score2 >=40 && score3 >= 40) && (sum >= 60);
		
		String result = (score1 >= 40 && score2 >=40 && score3 >= 40) && (sum >= 60) ? "합격" : "불합격";
		
		System.out.println(result);
		
		
		
	
	
		
	
	}
}
