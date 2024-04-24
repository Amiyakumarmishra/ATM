package com.atm.application.states.impl;

import com.atm.application.model.ATM;
import com.atm.application.model.TransactionType;
import com.atm.application.states.ATMStates;

public class SelectOperationState extends ATMStates{
	
	public SelectOperationState() {
		showOperations();
	}
	
	private void showOperations() {
		
		TransactionType.showTransactionTypes();
	}
	
	@Override
	public void selectOperation(TransactionType transactionType,ATM atm) {
		
		switch(transactionType) {
		
			case CASH_WITHDRWAL:
				atm.setCurrentAtmState(new CashWithDrawlState());
				break;
			case CHECK_BALANCE:
				atm.setCurrentAtmState(new CheckBalanceState());
				break;
			default:
				exit(atm);
		}

				
	}
}
