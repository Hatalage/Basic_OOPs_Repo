package com.opps;
class Engine {
	private String type;
	public void setType(String type)
	{
		this.type=type;
	}
	public String getType()
	{
		return type;
	}
	public String toString()
	{
		return type;
	}
}
public class CarSetterGetter {
		private int modelno;
		private String name;
		private int prise;
		Engine en;
		public void setModelno(int modelno)
		{
			this.modelno=modelno;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setPrise(int prise)
		{
			this.prise=prise;
		}
		public void setEngine(Engine en)
		{
			this.en=en;
		}
		public int getModelno()
		{
			return modelno;
		}
		public String getName()
		{
			return name;
		}
		public int getPrise()
		{
			return prise;
		}
		public Engine getEn()
		{
			return en;
		}
		public String toString()
		{
			return modelno+" "+name+" "+prise;
		}
		public static void main(String args[])
		{
			CarSetterGetter cs = new CarSetterGetter();
			cs.setModelno(101);
			cs.setName("Swift");
			cs.setPrise(1200000);
			cs.setEngine(new Engine());
			System.out.println(cs.getModelno());
			System.out.println(cs.getName());
			System.out.println(cs.getPrise());
			//System.out.println(cs.getEn());
			
			Engine en = cs.getEn();
			en.setType("CNG");
			System.out.println(en.getType());
		}
}
