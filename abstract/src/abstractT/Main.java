package abstractT;

public class Main {
	public static void main(String[] args) {
//		A a = new A(); 추상클래스 객체생성불가능
		B b = new B(); //상속받아서 가능
		
		b.getNum();
	}

	
	
}
