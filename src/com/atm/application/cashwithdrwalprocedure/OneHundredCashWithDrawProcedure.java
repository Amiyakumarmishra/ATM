package com.atm.application.cashwithdrwalprocedure;

import com.atm.application.model.ATM;

public class OneHundredCashWithDrawProcedure extends CashWithDrawlProcedure{

	public OneHundredCashWithDrawProcedure(CashWithDrawlProcedure nextCashWithDrawlProcedure) {
		super(nextCashWithDrawlProcedure);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withDrawCash(ATM atm,int remainingAmount) throws Exception {
		
		int numberoOneHundredNotesNow = atm.getNumberOfOneHundredNotes();
		int required = remainingAmount/100;
		int balance =  remainingAmount%100;
		
		if(required<=numberoOneHundredNotesNow) {
			atm.setNumberOfFiveHundredNotes(numberoOneHundredNotesNow-required);
		}else{
			atm.setNumberOfFiveHundredNotes(0);
			balance = balance + ((required-numberoOneHundredNotesNow)*100);
		}
		
		if(balance!=0) {
			System.out.println("Denominations not avaliable to fullfill your amount");
			throw new Exception();
		}
	}

}
