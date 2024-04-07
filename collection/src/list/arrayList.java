package list;

import java.util.ArrayList;
import java.util.List;

public class arrayList {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("딸기");
		list.add("바나나");
		list.add("망고");
		
		System.out.println(list);
		
		list.add(2, "수박");
		System.out.println(list);
		
		list.set(3, "사과");
		System.out.println(list);
	}
}
