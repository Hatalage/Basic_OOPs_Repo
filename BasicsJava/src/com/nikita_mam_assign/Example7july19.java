package com.nikita_mam_assign;
class MainBank
{
	public int getInterest()
	{
		return 0;
	}
}
class SBI extends MainBank
{
	public int getInterest()
	{
		return 4;
	}
}
class ICICI extends MainBank
{
	public int getInterest()
	{
		return 5;
	}
}
class Axis extends MainBank
{
	public int getInterest()
	{
		return 6;
	}
}
public class Example7july19 {
		public static void main(String[] args) {
			SBI sb = new SBI();
			System.out.println("SBI interest rate is: "+sb.getInterest()+"%");
			ICICI ci = new ICICI();
			System.out.println("SBI interest rate is: "+ci.getInterest()+"%");
			Axis ax = new Axis();
			System.out.println("SBI interest rate is: "+ax.getInterest()+"%");
		}
}
