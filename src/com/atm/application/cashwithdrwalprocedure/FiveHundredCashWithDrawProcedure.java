package com.atm.application.cashwithdrwalprocedure;

import com.atm.application.model.ATM;

public class FiveHundredCashWithDrawProcedure extends CashWithDrawlProcedure{

	public FiveHundredCashWithDrawProcedure(CashWithDrawlProcedure nextCashWithDrawlProcedure) {
		super(nextCashWithDrawlProcedure);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withDrawCash(ATM atm,int remainingAmount) throws Exception{
		
		int numberoFiveHundredNotesNow = atm.getNumberOfFiveHundredNotes();
		int required = remainingAmount/500;
		int balance =  remainingAmount%500;
		
		if(required<=numberoFiveHundredNotesNow) {
			atm.setNumberOfFiveHundredNotes(atm.getNumberOfFiveHundredNotes()-required);
		}else{
			atm.setNumberOfFiveHundredNotes(0);
			balance = balance + ((required-numberoFiveHundredNotesNow)*500);
		}
		
		if(balance!=0) {
			super.withDrawCash(atm, balance);
		}
	}

}
