package com.nikita_mam_assign;
class DemoStudent
{
	protected String name;
	protected int rno;
	DemoStudent(String name,int rno)
	{
		this.name=name;
		this.rno=rno;
	}
	public void show()
	{
		System.out.println("name\t: "+name);
		System.out.println("Roll No\t: "+rno);
	}
}
class Record extends DemoStudent
{
	String address;
	Record(String name,int rno, String address)
	{
		super(name,rno);;
		this.address=address;
	}
	public void show()
	{
		//super.show();
		System.out.println(name);
		
		System.out.println("Address\t: "+address);
	}
}
public class Example4july19 {
		public static void main(String args[])
		{
			DemoStudent s = new DemoStudent("shiv",12);
			s.show();
			System.out.println("......................");
			Record r = new Record("shiv",12,"Nipani");
			r.show();
		}
}
