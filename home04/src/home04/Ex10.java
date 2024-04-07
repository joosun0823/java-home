package home04;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {

//사용자로부터 과일 이름을 입력받아 해당하는 과일의 가격을 출력하기
//(사과: 1000원, 바나나: 1500원, 포도: 2000원, 기타: "가격 정보 없음")

		// 입력클래스
		// 입력받을 과일 변수 선언
		// "과일 이름: " 출력
		// 입력메소드
		// 입력한 값 출력
		// 스위치문 으로 조건에 맞춰 출력

		Scanner sc = new Scanner(System.in);

		String fruit = "";
		System.out.println("과일 이름: ");
		fruit = sc.next();
		System.out.println(fruit);

		switch (fruit) {
		case "사과":
			System.out.println("1000원");
			break;
		case "바나나":
			System.out.println("1500원");
			break;
		case "포도":
			System.out.println("2000원");
			break;
		default:
			System.out.println("가격정보 없음");
			break;
		}

	}
}
