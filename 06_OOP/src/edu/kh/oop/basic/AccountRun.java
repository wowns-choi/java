package edu.kh.oop.basic;

public class AccountRun {

	public static void main(String[] args) {

		Account ac = new Account();
		ac.setName("최재준");
		ac.setAccountNumber("111-111-111111");
		ac.setPassword("1234");
		ac.setbalance(0);
		
		ac.deposit(100);
		System.out.println();
		ac.withdraw("1234", 50);
	}


}
