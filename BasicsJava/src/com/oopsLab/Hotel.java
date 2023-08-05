package com.oopsLab;
class Item {
	int iid;
	String iname;
	int iprise;
	public Item(int iid, String iname, int iprise)
	{
		this.iid=iid;
		this.iname=iname;
		this.iprise=iprise;
	}
	public String toString()
	{
		return iid+" "+iname+" "+iprise;
	}
}

class Menu {
	int mid;
	String mname;
	Item it;
	public Menu(int mid, String mname, Item it)
	{
		this.mid=mid;
		this.mname=mname;
		this.it=it;
	}
	public String toString()
	{
		return mid+" "+mname+" "+it;
	}
}
public class Hotel {
		 	 int hid;
		 	 String hname;
		 	Menu mn;
		 public Hotel(int hid, String hname, Menu mn)
		 {
			 this.hid=hid;
			 this.hname=hname;
			 this.mn=mn;
		 }
		 public String toString()
		 {
			 return hid+" "+hname+" "+mn;
		 }
		 public static void main(String args[])
		 {
			 Hotel hgs = new Hotel(101,"Shiv",new Menu(102,"Panjabi",new Item(103,"DalMakhani", 500)));
			 System.out.println(hgs);
		 }
}
