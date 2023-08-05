package com.basics;

import java.util.Scanner;

public class VCSpecial {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter any character: ");
	  char ch = sc.next().charAt(0);
	   
	  if((ch>=65 && ch<=90)||(ch>=97 && ch<=122))
	  {
		  System.out.println(ch+" is an alphabet");
	  }
	  else if(ch>=48 && ch<=57)
	  {
		  System.out.println(ch+" is an digit");
	  }
	  else
	  {
		  System.out.println(ch+" is an special character");
	  }

	}

}
