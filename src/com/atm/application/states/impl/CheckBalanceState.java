package com.atm.application.states.impl;

import com.atm.application.model.ATM;
import com.atm.application.model.Card;
import com.atm.application.states.ATMStates;

public class CheckBalanceState extends ATMStates{
	
	@Override	
	public void displyBalance(ATM atm,Card card) {
		System.out.println("Avaliable amount in your account is: "+card.getBankAccount().getTotalBalance());
		exit(atm);
	}
}
