package com.atm.application.states.impl;

import com.atm.application.model.ATM;
import com.atm.application.model.Card;
import com.atm.application.states.ATMStates;

public class HasCardState extends ATMStates{
	
	@Override
	public void authenticatePin(ATM atm,Card card,int pin) {
		
		if(card.isCorrectPin(pin)) {
			atm.setCurrentAtmState(new SelectOperationState());
		}else {
			System.out.println("Invalid Pin Number");
			exit(atm);
		}
	}
	
	@Override
	public void exit(ATM atm) {
		returnCard();
		atm.setCurrentAtmState(new IdealState());
		System.out.println("Exit Happened..");
	}
	
	@Override
	public void returnCard() {
		System.out.println("Please Collect Your Card");
	}
	

}
