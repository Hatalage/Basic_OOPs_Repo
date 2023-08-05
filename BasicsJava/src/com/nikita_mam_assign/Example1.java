package com.nikita_mam_assign;
class kid
{
	public void readBook()
	{
		System.out.println("Read the book");
	}
	public void readBook(String name,int prise)
	{
		System.out.println(name);
		System.out.println(prise);
	}
}
class Bigkid extends kid
{
	public void readBook()
	{
		System.out.println("You must read this book");
	}
}
public class Example1 {
		public static void main(String args[])
		{
			kid k = new kid();
			k.readBook();
			k.readBook("java", 500);
			Bigkid bk = new Bigkid();
			bk.readBook();
		}
}
