package com.classTest;
class Building
{
	protected int floors;
	protected int rooms;
	protected int footage;
	Building(int floors,int rooms,int footage)
	{
		this.floors=floors;
		this.rooms=rooms;
		this.footage=footage;
	}
	public void show()
	{
		System.out.println("No of floors of a building: "+floors);
		System.out.println("No of rooms of a building: "+rooms);
		System.out.println("Total footage of a building: "+footage+" sq foot");
	}
}
class House extends Building
{
	int bedrooms;
	int bathrooms;
	House(int floors,int rooms,int footage,int bedrooms,int bathrooms)
	{
		super(floors,rooms,footage);
		this.bedrooms=bedrooms;
		this.bathrooms=bathrooms;
	}
	public void show()
	{
		super.show();
		System.out.println("No of bedrooms: "+bedrooms);
		System.out.println("No of bathrooms: "+bathrooms);
	}
}
class Office extends Building
{
	int telephones;
	int tables;
	Office(int floors,int rooms,int footage,int telephones,int tables)
	{
		super(floors,rooms,footage);
		this.telephones=telephones;
		this.tables=tables;
	}
	public void show()
	{
		super.show();
		System.out.println("No of telephones: "+telephones);
		System.out.println("No of tables: "+tables);
	}
}
public class Example3july21 {
		public static void main(String args[])
		{
			Building b = new Building(12,24,234);
			b.show();
			System.out.println(".................................");
			House h = new House(2,4,34,2,2);
			h.show();
			System.out.println(".................................");
			Office O = new Office(4,6,54,7,8);
			O.show();
		}
}
