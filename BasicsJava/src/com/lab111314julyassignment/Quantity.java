package com.lab111314julyassignment;

import java.util.Scanner;

public class Quantity {
		public static void main(String args[])
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Quantity of milk: ");
			float milkQty = sc.nextFloat();
			System.out.println("Enter the Quantity of oil: ");
			float oilQty = sc.nextFloat();
			while(milkQty>0&&oilQty>0)
			{
				float totalMilk = 40*milkQty;
				float totaloil = 50*oilQty;
				if(totalMilk>500&&totaloil>500)
				{
					System.out.println("The quantity of milk is:"+milkQty);
					System.out.println("The quantity of oil is:"+oilQty);
					break;
				}
				else
				{
					System.out.println("Enter some more quantity of milk and oil!!!");
					break;
				}
			}
		}
}
