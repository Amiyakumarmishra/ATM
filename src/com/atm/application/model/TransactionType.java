package com.atm.application.model;

public enum TransactionType {
	
	CHECK_BALANCE,CASH_WITHDRWAL,CASH_DEPOSIT;
	
	public static void showTransactionTypes() {
		for(TransactionType type : TransactionType.values()) {
			System.out.println(type.name());
		}
	}
}
