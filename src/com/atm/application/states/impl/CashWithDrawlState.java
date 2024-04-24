package com.atm.application.states.impl;

import com.atm.application.cashwithdrwalprocedure.CashWithDrawlProcedure;
import com.atm.application.cashwithdrwalprocedure.FiveHundredCashWithDrawProcedure;
import com.atm.application.cashwithdrwalprocedure.OneHundredCashWithDrawProcedure;
import com.atm.application.cashwithdrwalprocedure.TwoThousandCashWithDrawlProcedure;
import com.atm.application.model.ATM;
import com.atm.application.model.Card;
import com.atm.application.states.ATMStates;

public class CashWithDrawlState extends ATMStates {

	@Override
	public void cashWithdrawl(ATM atm,Card card,int withDrwalAmount) {
		if(card.getBankAccount().getTotalBalance()<withDrwalAmount) {
			System.out.println("insufficient balance in the account");
			exit(atm);
		}
		else if(atm.getAmountBalance()<withDrwalAmount) {
			System.out.println("insufficient balance in the account");
			exit(atm);
		}else {
			int numberOfFiveHundredNotes = atm.getNumberOfFiveHundredNotes();
			int numberOfOneHundredNotes = atm.getNumberOfOneHundredNotes();
			int numberOfTwoThousandNotes = atm.getNumberOfTwoThousandNotes();
			try {
				CashWithDrawlProcedure cashWithDrawlProcedure = new TwoThousandCashWithDrawlProcedure(new FiveHundredCashWithDrawProcedure(new OneHundredCashWithDrawProcedure(null)));
				cashWithDrawlProcedure.withDrawCash(atm, withDrwalAmount);
				atm.setAmountBalance(atm.getAmountBalance()-withDrwalAmount);
				card.getBankAccount().setTotalBalance(card.getBankAccount().getTotalBalance()-withDrwalAmount);
			}
			catch(Exception ex){
				atm.setNumberOfFiveHundredNotes(numberOfFiveHundredNotes);
				atm.setNumberOfOneHundredNotes(numberOfOneHundredNotes);
				atm.setNumberOfTwoThousandNotes(numberOfTwoThousandNotes);
				exit(atm);
			}
			

			exit(atm);
		}
		
		
	}
}
