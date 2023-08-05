package assign12july;

import java.util.Scanner;

public class Account {
		int acid;
		String cname;
		int bal;
		public void acceptDetails(int id, String name, int balance)
		{
			acid=id;
			cname=name;
			bal=balance;
		}
//		public void display()
//		{
//			System.out.println(acid+" "+cname+" "+bal);
//		}
		public void withdraw()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter amount to withdraw: ");
			int withdr = sc.nextInt();
			int total = bal-withdr;
			System.out.println("Your remaining amount: "+total);
		}
		public void deposit()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter amount for deposit: ");
			int deposit = sc.nextInt();
			int total = bal+deposit;
			System.out.println("Your remaining amount: "+total);
		}
		public static void main(String args[])
		{
			Account ac = new Account();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id, name, balance");
			ac.acceptDetails(sc.nextInt(),sc.next(),sc.nextInt());
//			ac.display();
			System.out.println("Choose option");
			System.out.println("1.Withdraw \n2. Deposit");
			int option = sc.nextInt();
			if(option==1)
			{
				ac.withdraw();
			}
			else 
			{
				ac.deposit();
			}
		}
}
