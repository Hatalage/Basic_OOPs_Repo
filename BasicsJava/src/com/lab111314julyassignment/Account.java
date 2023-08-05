package com.lab111314julyassignment;


import java.util.Scanner;
public class Account {
			int acnum;
			String cname;
			int bal;
			public void acceptDetails(int ac_num, String name, int balance)
			{
				acnum=ac_num;
				cname=name;
				bal=balance;
			}
			public void display()
			{
				System.out.println(acnum+" "+cname+" "+bal);
			}
			public void withdraw()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter amount to withdraw: ");
				int withdr = sc.nextInt();
				if(bal<withdr)
				{
					System.out.println("Insuficient balance!!!");
				}
				else
				{
				int total = bal-withdr;
				System.out.println("Your remaining amount: "+total);
				}
			}
			public void deposit()
			{
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter amount for deposit: ");
				int deposit = sc.nextInt();
				int total = bal+deposit;
				System.out.println("Your remaining amount: "+total);
			}
			public void check_balance()
			{
				//System.out.println("The available balance is: "+bal);
			   
				
			}
			public static void main(String args[])
			{
				Account ac = new Account();
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter id, name, balance");
				ac.acceptDetails(sc.nextInt(),sc.next(),sc.nextInt());
				ac.display();
				System.out.println("Choose option");
				System.out.println("1.Withdraw \n2. Deposit");
				int option = sc.nextInt();
				if(option==1)
				{
					ac.withdraw();
					ac.check_balance();
				}
				else 
				{
					ac.deposit();
					ac.check_balance();
				}
				sc.close();
			}
			
	}



