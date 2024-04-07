package generic;

public class DataList {
	
	//필드 모두 프라이빗
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	//생성자
	//객체 생성 시 데이터 필드 초기화
	public DataList() {
		this.data = new Object[defaultSize];
	}
	//매개변수 1개받는 생성자
	public DataList(int size) {
		this.data = new Object[size];
		//매개변수로 받는 정수형 변수를 배열의 크기로 지정
	}
	
	//메소드
	public void add(Object value) {
		data[size++] = value;
		//매개변수로 받는 오브젝트 타입의 변수를 배열에 넣어준다
	}
	
	public Object get(int index) {
		//매개변수로 받는 정수형 변수를 데이터 배열의 인덱스값에 넣어줘서 반환해준다
		return data[index];
	}
	
	public int size() {
		return size;
	}
	
}
