package tv;

public class TvMain{
	public static void main(String[] args) {
		Tv sTv = new Tv(2, 5, true, "black");
		//매개변수 4개 대입 객체
		System.out.println(sTv.ch);
		System.out.println(sTv.vol);
		System.out.println(sTv.power);
		System.out.println(sTv.color);
		//생성자를 사용하면 객체를 만들면서 동시에 내가 원하는 값으로 대입
	}
}
