package com.demo;

import java.util.Random;

public class Account {

	private long accNum;
	private double balance;
	private Person accHolder;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum() {
		Random n = new Random();
		long randAccNum = 100242382l;
		this.accNum = randAccNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	
	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
	}
	
	public void deposit(double amount) {
		this.setBalance(this.getBalance()+amount);
		System.out.println("Amount added : "+amount);
		System.out.println("Remaining Balance : "+ this.getBalance());
	}
	
	public void withdraw(double amount) {
		this.setBalance(this.getBalance()-amount);
		System.out.println("Amount deducted : "+amount);
		System.out.println("Remaining Balance : "+ this.getBalance());
	}
	
	
}
