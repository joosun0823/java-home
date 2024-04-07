package constructor;

public class A {
	int num;
	String name;
	int age;
	
	//생성자 오버로딩
	public A() {

	}
	
	public A(int num) {
		this();
		this.num = num;
	}

	public A(int num, String name) {
		this(num);
		this.name = name;
	}

	public A(int num, String name, int age) {
		this(num, name);
		this.age = age;
	}
	
	
}
