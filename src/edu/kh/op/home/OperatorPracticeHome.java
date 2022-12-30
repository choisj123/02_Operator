package edu.kh.op.home;

import java.util.Scanner;

public class OperatorPracticeHome {
	
	/*public static void main(String[] args) {
		
	

int a = 10;
int b = a++;

System.out.println(a+ "," + b);

System.out.println(a + b);
System.out.println(a - b);
System.out.println(a / b);
System.out.println(a * b);
System.out.println(a % b); 



}*/
	
	public void ex1() {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("인원 수: ");
	int people = sc.nextInt();
	System.out.print("사탕 개수: ");
	int candy = sc.nextInt();
	
	System.out.println("1인당 사탕 개수: " + candy / people);
	System.out.println("남은 사탕 개수: " + candy % people);
	
	
	}

	public void ex2() {
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
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, classRoom, number, gender, name, score);
	}

	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어: ");
		int korean = sc.nextInt();
		
		System.out.print("영어: ");
		int english = sc.nextInt();
		
		System.out.print("수학: ");
		int math = sc.nextInt();
		
		int sum = korean + english + math;
		double avg = sum / 3.0;
		
		System.out.println("합계: " + sum);
		System.out.printf("평균: %.1f" , avg);
		
		
		boolean result = (korean >= 40) && (english >= 40) && (math >=40) && (avg >=60);
		System.out.println();
		System.out.println(result ? "합격!! " : "불합격 ㅜㅜ");
	}
	
	}




