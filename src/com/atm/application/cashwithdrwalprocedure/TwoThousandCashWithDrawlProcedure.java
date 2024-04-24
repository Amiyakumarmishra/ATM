package com.atm.application.cashwithdrwalprocedure;

import com.atm.application.model.ATM;

public class TwoThousandCashWithDrawlProcedure extends CashWithDrawlProcedure{

	public TwoThousandCashWithDrawlProcedure(CashWithDrawlProcedure nextCashWithDrawlProcedure) {
		super(nextCashWithDrawlProcedure);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void withDrawCash(ATM atm,int remainingAmount) throws Exception{
		
		int numberoTwoThousandNotesNow = atm.getNumberOfTwoThousandNotes();
		int required = remainingAmount/2000;
		int balance =  remainingAmount%2000;
		
		if(required<=numberoTwoThousandNotesNow) {
			atm.setNumberOfTwoThousandNotes(numberoTwoThousandNotesNow-required);
		}else{
			atm.setNumberOfTwoThousandNotes(0);
			balance = balance + ((required-numberoTwoThousandNotesNow)*2000);
		}
		
		if(balance!=0) {
			super.withDrawCash(atm, balance);
		}
	}

}

