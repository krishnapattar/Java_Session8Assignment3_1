package com.thread.java;

public class Transation extends Thread {

	private Bank bank;

	

	public Transation(Bank bank) {
		super();
		this.bank = bank;
	}
	
	public void run() {
		super.run();
		bank.deposit(2000);
	bank.withdraw(400);
		
		
	}
	
	
	
	
	
	
	
	
}