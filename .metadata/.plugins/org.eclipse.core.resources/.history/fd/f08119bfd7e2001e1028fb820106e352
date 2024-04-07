package method;

import java.util.Scanner;

public class MethodTask {
	void printName() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("이름을 입력하세요");
		name = sc.next();

		for (int i = 0; i < 5; i++) {
			System.out.println(name + "님 안녕하세요");
		}
	}

	
	int getTotal(int num) {
		int total = 0;

		for (int i = 0; i <= num; i++) {
			total += i;
		}

		return total;
	}
	

	int getNumber() {

		Scanner sc = new Scanner(System.in);

		int num = 0;
		int total1 = 0;
		System.out.println("입력할 숫자 5개");

		for (int i = 0; i < 5; i++) {
			num = sc.nextInt();
			total1 += num;
		}

		return total1;

	}

	public static void main(String[] args) {

		MethodTask mt = new MethodTask();
		// 1. 이름을 넘겨받아 1. ~님 안녕하세요 5번 출력하는 메소드
		// 메소드명 : printName()
		mt.printName();

		// 2. 1~100까지의 합을 반환하는 메소드
		// 메소드명 : getTotal()

		System.out.println(mt.getTotal(100));

		// 3. 5개의 정수를 넘겨주면 합을 반환하는 메소드
		// 메소드명 : getNumber();

		System.out.println(mt.getNumber());
	}
}
