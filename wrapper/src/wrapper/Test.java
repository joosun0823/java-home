package wrapper;

public class Test {
	public static void main(String[] args) {
		//Integer, Double, Character, Boolean,String
		
		int num1 = 1;
		double num2 = 8.23;
		char data1 = 'a';
		String data2 = "김주선";
		boolean data3 = true;

		Object[] array = new Object[] { num1, num2, data1, data2, data3 };
		System.out.println(array);

		for (Object value : array) {
			System.out.println(value);
		}

		Object[] array2 = { 1,  1.17, 'b', "권혜림", false };
		System.out.println(array2);
		for (Object value : array2 ) {
			System.out.println(value);
		}

	}
}
