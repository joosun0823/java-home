package home04;

public class Ex02 {
	public static void main(String[] args) {
//		1부터 100까지의 숫자 중에서 7의 배수이면서 5의 배수가 아닌 숫자들을 출력하기
		
		// 정수형 변수 지정
		// 1~100까지 1씩 증가하는 반복문
		// 조건에 7배수는 7로 나눴을 때 나머지 0
		// 5의 배수가 아닌건 5로 나눴을 때 나머지 0이 아니면 됨
		// 안에 조건문으로 출력
		
		int num = 1;
		while(num <= 100) {
			if(num % 7 == 0 && num % 5 != 0){
				System.out.println(num);
			}
			++num;
		}
		
		System.out.println(num);
	}
}
