package inter;

public interface InterA {
	//상수, 추상메소드 + default, static, private
	final int NUM = 100;
	void getNum(); //인터페이스에서는 abstract 안붙여도 추상메소드로 간주
	
}
