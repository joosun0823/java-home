package twoArray;

public class Dan {
	public static void main(String[] args) {
		// 2단~9단까지 구구단 출력하기

				for (int dan = 2; dan < 10; dan++) {
					for (int num = 1; num < 10; num++) {
//						System.out.println(num);
						System.out.println(dan + "x" + num + "=" + dan * num);
					}
					System.out.println();
				}
	}
}
