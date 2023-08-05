package com.oops2;
public class FinalDemo {
		final int v=2023;
		final int num;
		static final int x;
		static
		{
			x=12;
		}
		public FinalDemo()
		{
			num=1234;
		}
		public FinalDemo(String str)
		{
			num=3456;
		}
		public static void main(String args[])
		{
			int a=10;
			a++;
			System.out.println(a);
			
			final int b;
			b=10;
			int c=a+b;
			System.out.println(b);
			System.out.println(c);
			
				FinalDemo fd = new FinalDemo();
				System.out.println(fd.v);
		}
		
}
