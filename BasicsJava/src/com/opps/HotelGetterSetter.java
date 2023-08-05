package com.opps;
class Item1 {
	private int iid;
	private String iname;
	private int prise;
	public void setIid(int iid)
	{
		this.iid=iid;
	}
	public void setIname(String iname)
	{
		this.iname=iname;
	}
	public void setPrise(int prise)
	{
		this.prise=prise;
	}
	public int getIid()
	{
		return iid;
	}
	public String getIname()
	{
		return iname;
	}
	public int getPrise()
	{
		return prise;
	}
	public String toString()
	{
		return iid+" "+iname+" "+prise;
	}
}
class Menu {
	private int mid;
	private String mname;
	private Item1 it;
	public void setMid(int mid)
	{
		this.mid=mid;
	}
	public void setMname(String mname)
	{
		this.mname=mname;
	}
	public void setItem(Item1 it)
	{
		this.it=it;
	}
	public int getMid()
	{
		return mid;
	}
	public String getMname()
	{
		return mname;
	}
	public Item1 getIt()
	{
		return it;
	}
	public String toString()
	{
		return mid+" "+mname;
	}
	
}
public class HotelGetterSetter {
		private int hid;
		private String hname;
		private Menu mn;
		public void setHid(int hid)
		{
			this.hid=hid;
		}
		public void setHname(String hname)
		{
			this.hname=hname;
		}
		public void setMenu(Menu mn)
		{
			this.mn=mn;
		}
		public int getHid()
		{
			return hid;
		}
		public String getHname()
		{
			return hname;
		}
		public Menu getMn()
		{
			return mn;
		}
		public String toString()
		{
			return hid+" "+hname;
		}
		public static void main(String args[])
		{
			HotelGetterSetter hgs = new HotelGetterSetter();
			hgs.setHid(101);
			hgs.setHname("shiv");
			System.out.println(hgs.getHid());
			System.out.println(hgs.getHname());
			
			hgs.setMenu(new Menu());
			Menu mn  = hgs.getMn();
			mn.setMid(10);
			mn.setMname("Panjabi");
			System.out.println(mn.getMid());
			System.out.println(mn.getMname());
			
			mn.setItem(new Item1());
			Item1 it = mn.getIt();
			it.setIid(103);
			it.setIname("DalMakhani");
			it.setPrise(500);
			System.out.println(it.getIid());
			System.out.println(it.getIname());
			System.out.println(it.getPrise());
		}
}
