package com.atm.application;

import com.atm.application.model.ATM;
import com.atm.application.model.BankAccount;
import com.atm.application.model.Card;
import com.atm.application.model.TransactionType;
import com.atm.application.model.User;

public class ATMRoom {
	
	ATM atm;
	User user;
	
	public static void main(String args[]) {
		ATMRoom atmRoom = new ATMRoom();
		
		atmRoom.initialize();
		atmRoom.atm.getCurrentAtmState().insertCard(atmRoom.atm,atmRoom.user.getCard());
		atmRoom.atm.getCurrentAtmState().authenticatePin(atmRoom.atm, atmRoom.user.getCard(), 122001);
		atmRoom.atm.getCurrentAtmState().selectOperation(TransactionType.CASH_WITHDRWAL, atmRoom.atm);
		atmRoom.atm.getCurrentAtmState().cashWithdrawl(atmRoom.atm, atmRoom.user.getCard(), 2500);
		atmRoom.atm.showCurrentAtmStatus();
		
	}
	private  void initialize() {
		// TODO Auto-generated method stub
		this.atm = ATM.getAtmObject();
		this.atm.setAmountBalance(3500);
		this.atm.setNumberOfTwoThousandNotes(1);
		this.atm.setNumberOfFiveHundredNotes(2);
		this.atm.setNumberOfOneHundredNotes(5);
		
		this.user = createUser();
		
	}

	private User createUser() {
		// TODO Auto-generated method stub
		User user = new User();
		user.setCard(createCard());
		
		return user;
	}

	private Card createCard() {
		// TODO Auto-generated method stub
		Card card = new Card();
		card.setBankAccount(createBankAccount());
		
		return card;
	}

	private BankAccount createBankAccount() {
		// TODO Auto-generated method stub
		BankAccount ba = new BankAccount();
		ba.setTotalBalance(6000);
		return ba;
	}
}
