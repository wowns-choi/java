package edu.kh.oop.basic;

public class Account {
	
	private String name;
	
	private String accountNumber;
	
	private int balance;
	
	private String password;
	
	
	public void deposit(int money) {
		this.balance += money;
		System.out.println(balance);
	}
	
	public void withdraw(String password, int money) {
		if(!this.password.equals(password)) {
			System.out.println("비밀번호 불일치");
		}
		if(this.balance - money <0) {
			System.out.println("잔액 부족");
		}
		if(this.password.equals(password) && this.balance-money>=0) {
			this.balance -= money;
			System.out.println("현재 잔액  :  " + this.balance);
		}
	}
	
	
	
	

	//getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getbalance() {
		return balance;
	}

	public void setbalance(int balance) {
		this.balance = balance;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	
}
