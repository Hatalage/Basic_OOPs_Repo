package LabAssignment;

import java.util.Scanner;

public class Coupon {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
				System.out.println("welcome!!");
				System.out.print("Enter the name:");
				String name = sc.next();
				System.out.println("Enter movie name:");
				String movie = sc.next();
				System.out.println("Enter coupon code:");
				float coupon = sc.nextFloat();
				
				System.out.println("Enter no. of pizza:");
				int x = sc.nextInt();
				int pizza = 100*x;
				System.out.println("Enter no. of puffs:");
				int y = sc.nextInt();
				int puff = 20*y;
				System.out.println("Enter no. of colddrinks:");
				int z = sc.nextInt();
				int colddrink = 10*z;
				
				System.out.println("amount of pizza:"+pizza);
				System.out.println("amount of puff:"+puff);
				System.out.println("amount of colddrink:"+colddrink);
				
				int total = pizza+puff+colddrink;
				System.out.println("total amount:"+total);
				if(total>1000)
				{
					System.out.println("you'll get 20% discount");
					float discount = total*0.2f;
					float ftotal=total-discount;
					System.out.println("your bill is:"+ftotal);
				}
				else if(total<1000)
				{
					int amount=1000-total;
					System.out.println("get extra!!");
					
				}
				
				 
	}

}
