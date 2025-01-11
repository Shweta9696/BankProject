package com.nit.Bank;

public class Account 
{
	private String holderName;
	private String accountNumber;
	private double balance;
	public Account(String holderName, String accountNumber, double balance) {
		super();
		this.holderName = holderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getHolderName() {
		return holderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	//deposit 
	public void deposit(double amount) 
	{
		if(amount>0) 
		{
			balance+=amount;
			System.err.println("Deposit successful:"+balance);
		}
		else {
			System.out.println("Invalid depost amount...");
		}
		
	}
	//withdraw
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance-=amount;
			System.out.println("Withdrawal successful."+balance);
		}
		else {
			System.out.println("Invalid withdraw...");
		}
	}
	

}




