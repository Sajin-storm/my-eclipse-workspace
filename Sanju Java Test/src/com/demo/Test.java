package com.demo;

public class Test {

	public static void main(String args[]) {

		//first person
		Person p1 = new Person();
		p1.setName("Smith");
		p1.setAge(25);
		
		//first account
		SavingAccount a1 = new SavingAccount();
		a1.setAccHolder(p1);
		a1.setBalance(2000);
		a1.setAccNum();
		
		System.out.println(a1);
		
		//second person
		Person p2 = new Person();
		p2.setName("Kathy");
		p2.setAge(34);
		
		//second account
		CurrentAccount a2 = new CurrentAccount();
		a2.setAccHolder(p2);
		a2.setBalance(3000);
		a2.setAccNum();
		
		System.out.println(a2);
		
		//depositing 2000 to smith
		a1.deposit(2000);
		
		//withdrawing 2000 from kathy
		a2.withdraw(2000);
		
		//displaying updated balance in both accounts
		System.out.println("Account Balance for "+a1.getAccHolder().getName()+" is : "+a1.getBalance());
		System.out.println("Account Balance for "+a2.getAccHolder().getName()+" is : "+a2.getBalance());
		
		
	}
}
