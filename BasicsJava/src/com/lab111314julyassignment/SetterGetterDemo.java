package com.lab111314julyassignment;

import java.util.Scanner;

public class SetterGetterDemo {
		private int id;
		private String name;
		private int balance;
		public void setId(int id)
		{
			this.id=id;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setBalance(int balance)
		{
			this.balance=balance;
		}
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
		}
		public int getBalance()
		{
			return balance;
		}
		public void withdraw()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the amount to be withdraw: ");
			int amount = sc.nextInt();
			int total = balance - amount;
			System.out.println("The remaining balance is: "+total);
		}
}
