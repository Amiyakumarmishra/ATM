package com.atm.application.model;

public class Card {
	
	private int cardNumber;
	private int cvv;
	private int expiryDate;
	static int PIN_NUMBER=122001;
	private BankAccount bankAccount;
	
	public boolean isCorrectPin(int enteredPin) {
		if(enteredPin==Card.PIN_NUMBER) {
			return true;
		}else {
			return false;
		}
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getCvv() {
		return cvv;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public int getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(int expiryDate) {
		this.expiryDate = expiryDate;
	}

	public static int getPIN_NUMBER() {
		return PIN_NUMBER;
	}

	public static void setPIN_NUMBER(int pIN_NUMBER) {
		PIN_NUMBER = pIN_NUMBER;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
}
