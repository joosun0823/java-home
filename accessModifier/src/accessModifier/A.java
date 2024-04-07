package accessModifier;

public class A {
	public int num1;
	protected int num2; //같은 패키지, 상속관계
	private int num3; //같은 클래스, get set
	//defautlt
	
	
	//생성자
	public A() {
		super();
	}

	
	//num3 get/set => 접근제한자가 private이면 같은 클래스에서 사용가능하지만
	//다른 클래스에선 사용할 수 없다 하지만 get/set을 이용해서 사용 가능하다
	//단축키는 alt shift s > r
	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
	
	
	
}
