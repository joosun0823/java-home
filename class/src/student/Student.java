package student;

public class Student {
	//필드
	String name; //이름
	int math; //수학  점수
	int eng; //영어 점수
	int kor; //국어 점수
	double avg; //평균
	char grade; //등급
	
	//메소드
	int getTotal() {
		return math + eng + kor;
		//수학, 영어, 국어점수 총합 메소드
	}
	
	double getAvg() {
		return getTotal()/3.0;
	} //평균 구하는 메소드 평균은 실수형 double타입

}
