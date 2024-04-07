package account;

import account.MyException;

public class Account {
//은행계좌 클래스
	
//필드 잔고
	private int balance;
//기본생성자
	public Account() {
		super();
	}
	
//get/set
	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	
//출금메소드 : withdraw 매개변수 1개
//	잔액보다 출금금액이 크다면 출금불가 예외처리/현재 잔고는 _원입니다. 출금금액의 _원이 부족하여 출금이 불가능합니다 출력
	void withdraw(int amount) throws MyException{
		if(balance < amount) {
			throw new MyException("출금 불가능 : 현재 잔고는 "+ this.balance + "원 , 출금금액의 " 
		+ (amount-this.balance) + "원이 부족합니다");
		}else {
			balance -= amount;
			System.out.println(amount + "원이 출금되었습니다. 현재 잔고는 "+ this.balance +"입니다");
		}
	}

	
//입금메소드 : deposit 매개변수 1개
//	잔액에 입금된 금액 추가후 입금된 금액은 _원입니다. 현재 잔고는 _원입니다. 출력
	void deposit(int amount) {
		balance += amount;
		System.out.println(amount +"원 입금 : 현재 잔고는 " + this.balance + "입니다");
	}
		

	
}