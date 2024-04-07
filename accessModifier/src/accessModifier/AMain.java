package accessModifier;

public class AMain {
	public static void main(String[] args) {
		A a = new A();
		a.num1 = 10;
		a.num2 = 9;
		a.setNum3(8);

		
		System.out.println(a.num1);
		System.out.println(a.num2);
		System.out.println(a.getNum3());
		
	}
}
