package com.thread.java;

/*
 * Write an application to implement the basic functions for the Online
Banking Application
 */
public class Bank {

//int accountNo;
int balance;

public Bank(int balance) {
	// TODO Auto-generated constructor stubb
	this.balance=balance;
	//this.accountNo=accountNo;
	
}

     public synchronized void   withdraw(int amount ){
	
	
	if(balance<amount){
		System.out.println("balace is not available");
	}else{
		System.out.println("available balance is "+balance);
		  int newBalance = balance - amount;
		 
		                     
		  
		                     
		                      try {
		              			Thread.sleep(1000);
		              		} catch (InterruptedException e) {
		              			// TODO Auto-generated catch block
		              			e.printStackTrace();
		              		}
		              		this.balance=newBalance;
		              		System.out.println("your balance is "+newBalance);
		                  }              

	
	
	
}
	public synchronized void   deposit(int amount){
		int temp=this.balance;
		//int temp2=this.accountNo;
		
		//int temp2=this.accountNo;
		temp=temp+amount;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.balance=temp;
		System.out.println("your balance is "+balance);
		}
		
		
	
	
}