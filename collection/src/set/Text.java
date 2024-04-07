package set;

public class Text {
	//필드
	private int msgNumber;
	private String msg;
	
	//생성자
	public Text(int msgNumber, String msg) {
		super();
		this.msgNumber = msgNumber;
		this.msg = msg;
	}

	//get
	public int getMsgNumber() {
		return msgNumber;
	}

	public String getMsg() {
		return msg;
	}

	//hashcode, eqauls 오버라이딩
	@Override
	public int hashCode() {
		//식별번호 리턴
		return msgNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Text) { //obj가 Text타입을 포함한다면
			Text compare = (Text) obj; // 다운캐스팅
			if(this.msg.equals(compare.getMsg())) { 
				//msg와 객체에 들어온 msg가 동등한지 비교
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}
	
	
}
