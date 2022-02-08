package com.demo;

public class SavingAccount extends Account{

	private final double minimumBalance = 1000;
	
	
	public double getMinimumBalance() {
		return minimumBalance;
	}
	
	

	@Override
	public void withdraw(double amount) {
		if(this.getBalance() > amount ) {
			this.setBalance(this.getBalance()-amount);
			System.out.println("Amount deducted : "+amount);
			System.out.println("Remaining Balance : "+ this.getBalance());
		} else {
			System.out.println("Low Balance cannot withdraw");
		}
	}
	
}
