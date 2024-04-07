package home04;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
//		사용자로부터 사칙연산(+, -, *, /) 중 하나를 입력받아 
//		두 개의 정수에 대해 해당 연산을 수행하여 결과를 출력하기
		
		//입력클래스
		//사칙연산 값 넣어줄 변수 선언
		//정수형 변수 두개 선언
		//스위치문으로 사칙연산이 각각나올때
		//입력한 두 정수 사칙연산되게 출력
		
		String a = "";
		int num1 = 0, num2 = 0;
		
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		a = sc.next();
		
		switch(a) {
		case "+":
			System.out.println( num1 + num2 );
			break;
		case "-":
			System.out.println( num1 - num2 );
			break;
		case"*":
			System.out.println( num1 * num2 );
			break;
		case"/":
			System.out.println( num1 / num2 );
			break;
		}
		
	}
}
