package home04;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
//		사용자로부터 과목의 점수를 입력받아 해당 점수가 합격인지 
//		불합격인지를 판별하여 출력하기(60점 이상이면 합격, 미만이면 불합격)
		
		//정수형 변수 선언
		//입력클래스
		//"점수 :" 출력
		//입력메소드
		//60이상 합격, 미만 불합격 조건문 쓰기
		//점수는 100점 이상으로 가면 안됨
		
		int score = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 :");
		
		score = sc.nextInt();
		
		if( score >= 60 && score <= 100 ) {
			System.out.println("합격");
		}	else {
			System.out.println("불합격");
		}
		
	}
}
