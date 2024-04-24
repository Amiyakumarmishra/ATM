package com.atm.application.model;

public class BankAccount {
	
	private int totalBalance;
	
	public int getTotalBalance() {
		return totalBalance;
	}

	public void setTotalBalance(int totalBalance) {
		this.totalBalance = totalBalance;
	}

	public void withDrawl(int amount) {
		this.totalBalance=this.totalBalance-amount;
	}
	
	public void deposit(int amount) {
		this.totalBalance=this.totalBalance+amount;
	}
	
}
