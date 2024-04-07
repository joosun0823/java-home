package account;

import account.Account;
import account.MyException;

public class AccountMain {
	public static void main(String[] args) {
		Account account = new Account();
		
		try {
			account.deposit(50000); //입금
			account.withdraw(10000); //출금
			account.withdraw(50000); //출금
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}	
	}
}
