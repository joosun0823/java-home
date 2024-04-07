package map;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("spring","봄");
		map.put("summer","여름");
		map.put("fall","가을");
		map.put("winter","겨울");
		
		System.out.println(map);
		
		map.remove("winter");
		System.out.println(map);
		System.out.println(map.containsKey("spring"));
		System.out.println(map.containsKey("winter"));
		
		System.out.println(map.containsValue("가을"));
	}
}
