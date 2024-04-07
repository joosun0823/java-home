package generic;

public class DataListExample {
	public static void main(String[] args) {
		DataList list = new DataList();
		DataList2 list2 = new DataList2();
		
		list.add(10);
		list.add("문자");
		list.add(10.33);
		
		list2.add(5);
		list2.add("문자2");
		list2.add(9.5);
		
		
		for(int i=0; i < list.size(); i++) {
			Object data = list.get(i);
			
			if(data instanceof Integer) {
				System.out.println("정수: " + (int) data);
			} else if(data instanceof Double) {
				System.out.println("실수: " + (double) data);
			} else if(data instanceof String) {
				System.out.println("문자열: " + (String) data);
			}
		}
		
		System.out.println("=========");
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.getData()[i]);
		}
		
		
	}
}
