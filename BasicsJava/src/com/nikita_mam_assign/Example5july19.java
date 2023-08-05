package com.nikita_mam_assign;

import java.util.Scanner;

class Base {
    int num1, num2;

    public void Scanner() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();
    }
}

class DeriveDemo extends Base {
    DeriveDemo() {
        super();
    }

    public  void dispMax() {
        System.out.println("Maximum of " + num1 + " and " + num2 + " is " + Math.max(num1, num2));
    }

   public void dispMin() {
        System.out.println("Minimum of " + num1 + " and " + num2 + " is " + Math.min(num1, num2));
    }

public class Example5july19 {
	public static void main(String[] args) {
		Base b = new Base();
		b.Scanner();

        DeriveDemo d = new DeriveDemo();
        d.dispMax();
        d.dispMin();
    }
    }	
	}