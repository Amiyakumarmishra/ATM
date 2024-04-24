package com.atm.application.states;

import com.atm.application.model.ATM;
import com.atm.application.model.Card;
import com.atm.application.model.TransactionType;
import com.atm.application.states.impl.IdealState;

public abstract class ATMStates {
	
	public void insertCard(ATM atm,Card card) {
		System.out.println("!oops something went wrong");
	}
	
	public void authenticatePin(ATM atm,Card card,int pin) {
		System.out.println("!oops something went wrong");
	}
	
	public void selectOperation(TransactionType transactionType,ATM atm) {
		System.out.println("!oops something went wrong");
	}
	
	public void cashWithdrawl(ATM atm,Card card,int withDrwalAmount) {
		System.out.println("!oops something went wrong");
	}
	
	public void displyBalance(ATM atm,Card card) {
		System.out.println("!oops something went wrong");
	}
	
	public void cashDeposit() {
		System.out.println("!oops something went wrong");
	}
	

	public void exit(ATM atm) {
		returnCard();
		atm.setCurrentAtmState(new IdealState());
		System.out.println("Exit Happened..");
	}
	

	public void returnCard() {
		System.out.println("Please Collect Your Card");
	}

}
