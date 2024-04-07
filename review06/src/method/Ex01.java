package method;

import java.util.Scanner;

public class Ex01 {
//	void printName() {
//		Scanner sc = new Scanner(System.in);
//		String name = "";
//		System.out.println("이름을 입력하세요");
//		name = sc.next();
//
//		for (int i = 0; i < 5; i++) {
//			System.out.println(name + "님 안녕하세요");
//		}
//	}
	
	
	void printName(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "님 안녕하세요");
		}
	}
	
	
	
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		
		// 1. 이름을 넘겨받아 1. ~님 안녕하세요 5번 출력하는 메소드
		// 메소드명 : printName()
//		ex.printName();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = "";
		name = sc.next();
		ex.printName(name);
		
		
	}
}
