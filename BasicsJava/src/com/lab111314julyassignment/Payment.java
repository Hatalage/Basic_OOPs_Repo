package com.lab111314julyassignment;

public class Payment {
		public static void main(String args[])
		{
			SetterGetterDemo gs = new SetterGetterDemo();
			gs.setId(101);
			gs.setName("shiv");
			gs.setBalance(20000);
			System.out.println("The customer id is: "+gs.getId());
			System.out.println("The customer name is: "+gs.getName());
			System.out.println("The customer balance is: "+gs.getBalance());
			gs.withdraw();
		}
}
