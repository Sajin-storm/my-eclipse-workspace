package com.demo;

public class CurrentAccount extends Account{
	
	private boolean overDraftLimit = false;

	public boolean getOverDraftLimit() {
		return overDraftLimit;
	}

	public void setOverDraftLimit(boolean overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	@Override
	public void withdraw(double amount) {
		this.setBalance(this.getBalance()-amount);
		System.out.println("Amount deducted : "+amount);
		System.out.println("Remaining Balance : "+this.getBalance());
		
		if(this.getBalance()<0) {
			this.setOverDraftLimit(true);
			System.out.println("Over Draft Limit reached");
		} else {
			this.setOverDraftLimit(false);
		}
			
	}
}
