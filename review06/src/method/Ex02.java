package method;

public class Ex02 {
//	int getTotal(int num) {
//		int total = 0;
//
//		for (int i = 0; i <= num; i++) {
//			total += i;
//		}
//
//		return total;
//	}
	
	
	void getTotal(int num) {
		int total = 0;
		
		for(int i = 0; i <= num; i++) {
			total += i;
		}
		
		System.out.println(total);
	}
	
	
	public static void main(String[] args) {
		// 2. 1~100까지의 합을 반환하는 메소드
		// 메소드명 : getTotal()
		Ex02 ex = new Ex02();
		
//		System.out.println(ex.getTotal(100));
		
		ex.getTotal(100);
	}
}
