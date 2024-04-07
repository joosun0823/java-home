package home04;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
//		사용자로부터 1에서 7까지의 숫자를 입력받아 해당하는 요일을 출력하기 
//		(1이면 "월요일", 2이면 "화요일", ..., 7이면 "일요일")
		
		//입력클래스
		//정수형 변수 선언
		//"1~7 중 숫자 입력: " 출력
		// 입력메소드
		// 입력한 값 출력
		// 1부터 7까지 각각 스위치문으로 써주기
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		System.out.println("1~7 중 숫자 입력 : ");
		num = sc.nextInt();
		System.out.println(num);
		
		switch (num) {
		case 1:
			System.out.println("월요일");
			break;
		case 2:
			System.out.println("화요일");
			break;
		case 3:
			System.out.println("수요일");
			break;
		case 4:
			System.out.println("목요일");
			break;
		case 5:
			System.out.println("금요일");
			break;
		case 6:
			System.out.println("토요일");
			break;
		case 7:
			System.out.println("일요일");
			break;
			
		}
	}
}
