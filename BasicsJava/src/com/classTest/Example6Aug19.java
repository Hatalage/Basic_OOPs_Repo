package com.classTest;

public class Example6Aug19 {
		static void overloadedMethod(int i)
		{
		System.out.println("Double Wrapper Class Type");
		}
		static void overloadedMethod(Long L)
		{
		System.out.println("Long Wrapper Class Type");
		}
		public static void main(String[] args)
		{
		int i = 120;
		overloadedMethod(i); 
		}
		}

