package testReview;

import java.util.Scanner;

public class Locker {
	
	int[] pw(int length, Scanner sc) {
		int[] lcPw = new int[length];
		String mainMsg = "번 사물함의 비밀번호 설정: ";
		
		for(int i = 0; i< length; i++) {
			System.out.println(i+1 + mainMsg);
			lcPw[i] = sc.nextInt();
		}
		
		return lcPw;
		
	}
	
	String check(int lockerPw, int inputPw) {
		String result="";
		
		if(lockerPw == inputPw) {
			result = "비밀번호가 일치합니다";
		} else {
			result = "비밀번호가 불일치합니다";
		}
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		Locker lk = new Locker();
		Scanner sc = new Scanner(System.in);
	
		String choiceMsg = "사물함 번호 입력: ";
		String psw = "비밀번호 입력: ";
		int choice = 0, inputPw = 0;
		
		int[] lcpw = lk.pw(5, sc);
		
		System.out.println(lcpw);
		System.out.println(choiceMsg);
		choice = sc.nextInt();
		System.out.println(psw);
		inputPw = sc.nextInt();
		
		lk.check(lcpw[choice-1], inputPw);
		System.out.println(lk.check(lcpw[choice-1], inputPw));
	}
}
