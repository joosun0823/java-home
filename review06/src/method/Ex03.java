package method;

import java.util.Scanner;

public class Ex03 {
	
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
		// 3. 5개의 정수를 넘겨주면 합을 반환하는 메소드
		// 메소드명 : getNumber();
		Ex03 ex = new Ex03();
		System.out.println(ex.getNumber());

		
	}
}
