package com.classTest;

import java.util.Scanner;

abstract class Accounts
{
	public double balance;
	public int accountNum;
	public String accountHolderName;
	Accounts(double balance,int accountNum,String accountHolderName)
	{
		this.balance=balance;
		this.accountNum=accountNum;
		this.accountHolderName=accountHolderName;
	}
	public abstract void withdraw();
	public abstract void deposit();
	public void display() 
	{
		System.out.println("Balance\t: "+balance);
		System.out.println("Account Number\t: "+accountNum);
		System.out.println("Account Holders Name\t: "+accountHolderName);
	}
}
class SavingAccount extends Accounts
{
	SavingAccount(double balance,int accountNum,String accountHolderName)
	{
		super(balance,accountNum,accountHolderName);
	}
	public void withdraw()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount to withdraw: ");
		double withdr = sc.nextDouble();
		double total = balance-withdr;
		System.out.println("Your remaining amount: "+total);
	}
	@Override
	public void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount for deposit: ");
		double deposit = sc.nextDouble();
		double total = balance+deposit;
		System.out.println("Your remaining amount: "+total);
		
	}
}
public class Example10july21 {
	public static void main(String args[])
	{
		Accounts ac = new SavingAccount(5000,123456,"shiv");
		ac.display();
		ac.withdraw(); 
		ac.deposit();
	}	
}
