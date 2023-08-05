package com.nikita_mam_assign;
interface DemoBike
{
	default void details1()
	{
		System.out.println("default details for bike");
	}
	void offer1();
}
interface Scooty
{
	default void details2()
	{
		System.out.println("default details for scooty");
	}
	void offer2();
}
class BuySomething implements DemoBike,Scooty
{
	public void details1()
	{
		System.out.println("buy the bike");
	}
	public void details2()
	{
		System.out.println("buy the scooty");
	}
	@Override
	public void offer1() {
		System.out.println("offer for bike");
	}
	public void offer2() {
		System.out.println("offer for scooty");
	}
	
}
public interface Example3july24 {
	public static void main(String[] args) {
		BuySomething by = new BuySomething();
		by.details1();
		by.details2();
		by.offer1();
		by.offer2();
	}
}
