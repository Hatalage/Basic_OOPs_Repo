package com.oopsLab;


import java.util.Scanner;

public class Booking {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter name");
			String name=sc.next();
		    System.out.println("Do you have any coupon code y/n");
		       Movie m=new Movie();
		    
		    float p=0.0f;
		    
		    char ch=sc.next().charAt(0);
		    
		    if(ch=='y' || ch=='Y')
		    {
		    	System.out.println("Enter coupon code");
		    	int code=sc.nextInt();
		    	if(code==50)
		    	{
		    	 p=m.getPrice()-50;
		    	 System.out.println(p);
		    	}
		    }
		    System.out.println("name is..."+name);
		    System.out.println("your booking is confirmed");
		    System.out.println("after discount ur ticket price is.."+p);
		    }
		}

