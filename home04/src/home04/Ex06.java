package home04;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
//		사용자로부터 두 개의 문자를 입력받아 
//		두 문자 중 아스키코드 값이 더 큰 문자를 출력하기
		
		//입력클래스
		//문자열 변수 두개 선언
		//"문자 입력: " 출력
		//출력받은 값 유니코드 값 구하기 위해 int로 강제 형변환
		//값 비교하는 조건문으로 출력
		
		String word1 = "", word2 = "";
		Scanner sc= new Scanner(System.in);
		System.out.println("문자 입력: ");
		word1 = sc.next();
		int code1 = (int) word1.charAt(0);
		word2 = sc.next();
		int code2 = (int) word2.charAt(0);
		
		
		if( code1 > code2 ) {
			System.out.println(code1);
			System.out.println(word1 + "가 더크다");
		} else if ( code2 > code1) {
			System.out.println(code2);
			System.out.println(word2 + "가 더크다");
		} else {
			System.out.println("같다");
		}

	}
}
