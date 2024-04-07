package iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {
	//iterator 반복자
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		for(int i = 1; i <= 10; i ++) {
			set.add(i);
		} //set에 값 추가
		
		//iterator 객체 생성
		Iterator<Integer> iter = set.iterator();
		
		int num = 0;
		
		while(iter.hasNext()) { //다음 순회할 데이터가 있다면 반복
			int value = iter.next(); //다음 위치 데이터로 이동해서 반환
			System.out.println("set[" + num++ + "] : " + value);
		}
		
	}
}
