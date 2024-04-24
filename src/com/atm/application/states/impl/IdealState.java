package com.atm.application.states.impl;

import com.atm.application.model.ATM;
import com.atm.application.model.Card;
import com.atm.application.states.ATMStates;

public class IdealState extends ATMStates{
	
	@Override
	public void insertCard(ATM atm,Card card) {
		System.out.println("Card inserted");
		atm.setCurrentAtmState(new HasCardState());
	}
}
