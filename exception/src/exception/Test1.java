package exception;

public class Test1 {
   public static void main(String[] args) {
      try {
         int result = 1 / 0;
         System.out.println(result);
      }catch(ArithmeticException e) {
         System.out.println(e); //클래스이름: 오류내용
         System.out.println(e.toString());
         System.out.println("0으로 나눌 수 없음");
      }catch(Exception e) {
         System.out.println("예외발생");
      }finally {
         System.out.println("예외처리 완료");
      }
      
      System.out.println("종료");
   }
}
