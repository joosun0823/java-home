package generic;

public class DataList2<T> {
	//필드 모두 프라이빗
	private Object[] data;
	private int size;
	private int defaultSize = 10;
	
	//생성자
	//객체 생성 시 데이터 필드 초기화
	public DataList2() {
		this.data = new Object[defaultSize];
	}
	//매개변수 1개받는 생성자
	public DataList2(int size) {
		this.data = new Object[size];
		//매개변수로 받는 정수형 변수를 배열의 크기로 지정
	}
	
	public Object[] getData() {
		return data;
	}
	//메소드
	public void add(T value) {
		data[size++] = value;
		//매개변수로 받는 오브젝트 타입의 변수를 배열에 넣어준다
	}
	
	public T get(int index) {
		//매개변수로 받는 정수형 변수를 데이터 배열의 인덱스값에 넣어줘서 반환해준다
		return (T) data[index];
	}
	
	public int size() {
		return size;
	}
}
