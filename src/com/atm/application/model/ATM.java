package com.atm.application.model;

import com.atm.application.states.ATMStates;
import com.atm.application.states.impl.IdealState;

public class ATM {
	
	private ATMStates currentAtmState;
	
	private static ATM atm = new ATM();
	
	public ATM() {
		this.currentAtmState = new IdealState();
	}
	
	private int amountBalance;
	private int numberOfFiveHundredNotes;
	private int numberOfTwoThousandNotes;
	private int numberOfOneHundredNotes;

	public int getAmountBalance() {
		return amountBalance;
	}
	public void setAmountBalance(int amountBalance) {
		this.amountBalance = amountBalance;
	}
	public int getNumberOfFiveHundredNotes() {
		return numberOfFiveHundredNotes;
	}
	public void setNumberOfFiveHundredNotes(int numberOfFiveHundredNotes) {
		this.numberOfFiveHundredNotes = numberOfFiveHundredNotes;
	}
	public int getNumberOfTwoThousandNotes() {
		return numberOfTwoThousandNotes;
	}
	public void setNumberOfTwoThousandNotes(int numberOfTwoThousandNotes) {
		this.numberOfTwoThousandNotes = numberOfTwoThousandNotes;
	}
	public int getNumberOfOneHundredNotes() {
		return numberOfOneHundredNotes;
	}
	public void setNumberOfOneHundredNotes(int numberOfOneHundredNotes) {
		this.numberOfOneHundredNotes = numberOfOneHundredNotes;
	}
	public ATMStates getCurrentAtmState() {
		return currentAtmState;
	}
	public void setCurrentAtmState(ATMStates atmState) {
		this.currentAtmState = atmState;
	}
	
	public void showCurrentAtmStatus() {
		
		System.out.println("total amount :"+this.getAmountBalance());
		System.out.println("Number of Five Hundred Notes :"+this.getNumberOfFiveHundredNotes());
		System.out.println("Number of Two Thousand Notes : :"+this.getNumberOfTwoThousandNotes());
		System.out.println("Number of One Hundred Notes ::"+this.getNumberOfOneHundredNotes());

	}
	
	public static ATM getAtmObject() {
		return atm;
	}
	
}
