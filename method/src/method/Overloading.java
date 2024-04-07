package method;

public class Overloading {
	//매개변수의 개수, 순서, 타입이 다를 때 같은 메소드명으로 선언가능 => 오버로딩
	void printNum(int num) {
		//정수형
	}
	
	void printNum(double num) {
		//실수형
	}
	
	void printNum(String name) {
		//문자열
	}

	void printNum(int[] num) {
		//정수형 배열
	}
}
