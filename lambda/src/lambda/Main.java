package lambda;

public class Main {
	public static void main(String[] args) {
//		A a = new A(); 인터페이스 객체화 불가능
		
		A a = new A() { //익명 클래스로 객체화 가능
			
			@Override
			public int addNum(int num) {
				// TODO Auto-generated method stub
				return num;
			}
		};
		
		
		//람다식은 함수형 인터페이스만 가능
		//매개변수옆 화살표 그려줌
		//메소드명 없애줌
		//반환타입 매개변수 타입 추론 가능 시 생략
		//매개변수 한개면 매개변수의 중괄호도 생략가능
		//명령할 구문이 한줄이면 중괄호도 생략 가능
		//단 명령부 중괄호 생략 시 return도 생략해줌
		
		A a1 = num-> num+10;
			
		System.out.println(a1.addNum(10));
		
		
	}
}
