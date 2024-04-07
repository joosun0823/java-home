package set;

import java.util.HashSet;
import java.util.Set;

public class TextMain {
	public static void main(String[] args) {
		Set<Text> msgSet = new HashSet<>();
		//hashset은 순서 없고, 중복 불가능
		
		Text msg1 = new Text(101,"김주선");
		Text msg2 = new Text(101,"김주선");
		Text msg3 = new Text(101,"김선");
		Text msg4 = new Text(102,"김모씨");
		Text msg5 = new Text(103,"권모씨");
		
		msgSet.add(msg1);
		msgSet.add(msg2);
		msgSet.add(msg3);
		msgSet.add(msg4);
		msgSet.add(msg5);
		
		System.out.println(msgSet.size());
		
		for(Text msg : msgSet) {
			System.out.println("번호: " + msg.getMsgNumber() + ", 내용: " + msg.getMsg());
		}

	}
}
