package com.capgemini.BankATMSystem;

public class Account extends CustomerImpl{

	private long accountNumber;
	private double openningBalance;
	private String pin;
	private int flag;
	Account()
	{
		
	}

	public Account(long accountNumber, double openningBalance, String pin) {
		super();
		this.accountNumber = accountNumber;
		this.openningBalance = openningBalance;
		this.pin = pin;
	}



	//getters and setters
	public long getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getOpenningBalance() {
		return openningBalance;
	}
	public void setOpenningBalance(double openningBalance) {
		this.openningBalance = openningBalance;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

}
