package throwThrows;

public class throwTest {
//	  public static void main(String[] args) {
//	  System.out.println("예외를 강제 발생");
//	
//	  try {
//	     throw new NumberFormatException();
//	  }catch(NumberFormatException e) {
//	     System.out.println(e.getMessage());
//	  }
//	  
//	//  NumberFormatException 발생하는 경우 문자열 값을 숫자형 변환
//	  String str = "123abc";
//	  int number = Integer.parseInt(str);
//	  System.out.println(str);
//	  
//	
//	}
	
	public static void main(String[] args) {
		
		   String str = "123abc";
		   try {
			   int num = Integer.parseInt(str);
		   } catch (NumberFormatException e) {
			   System.out.println(e.toString());
			   System.out.println(str);
		   }
		   
	   }

}
