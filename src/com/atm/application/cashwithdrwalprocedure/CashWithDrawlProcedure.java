package com.atm.application.cashwithdrwalprocedure;

import com.atm.application.model.ATM;

public class CashWithDrawlProcedure {
	
	CashWithDrawlProcedure nextCashWithDrawlProcedure;
	
	public CashWithDrawlProcedure(CashWithDrawlProcedure nextCashWithDrawlProcedure) {
		this.nextCashWithDrawlProcedure=nextCashWithDrawlProcedure;
	}
	
	public void withDrawCash(ATM atm,int withDrawAmount) throws Exception {
		
		if(this.nextCashWithDrawlProcedure!=null) {
			nextCashWithDrawlProcedure.withDrawCash(atm, withDrawAmount);
		}
	}
}
