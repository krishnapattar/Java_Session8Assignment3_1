package com.thread.java;

public class TestBank {
public static void main(String[] args) {// Main methods starts
	
	Bank b=new Bank(2000);
Transation t1=new Transation(b);
Transation t2=new Transation(b);
	t1.start();
	t2.start();
	
}
}