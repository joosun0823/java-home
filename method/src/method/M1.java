package method;

public class M1 {
	int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void main(String[] args) {
		M1 m = new M1();
		
		m.add(1, 2);
		System.out.println(m.add(1, 2));
		System.out.println(m.add(5, 2));
		System.out.println(m.add(1, 8));
	}
}
