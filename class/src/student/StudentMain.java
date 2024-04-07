package student;

public class StudentMain {
	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		
		st1.name = "김주선"; //학생1이름
		st1.math = 90;//학생1 수학점수
		st1.eng = 80;//학생1 영어점수
		st1.kor = 100;//학생1 국어점수
		
		//st1의 총합 구하기
		System.out.println(st1.getTotal());
		
		//st1의 평균 구하기 메소드 호출
		System.out.println(st1.getAvg());
		
		st2.name = "권혜림";
		st2.math = 80;
		st2.eng = 90;
		st2.kor = 90;
		
		System.out.println(st2.name);
		System.out.println(st2.getAvg());
	}
}
