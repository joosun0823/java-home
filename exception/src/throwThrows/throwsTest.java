package throwThrows;

public class throwsTest {
	static void method() throws InterruptedException { //예외 던지기 선언부
		for(int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
	}
	
	
	public static void main(String[] args) {
		//던진 예외를 메인메소드에서 try catch문으로 예외처리
		try {
			method();			
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
