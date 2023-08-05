package com.nikita_mam_assign;
class person
{
	public void readScript()
	{
		System.out.println("Read the script");
	}
}
class actor extends person
{
	public void readScript()
	{
		System.out.println("Actor has to to script before acting");
	}
}
public class Example8 {
		public static void main(String args[])
		{
			person p = new person();
			p.readScript();
			actor a = new actor();
			a.readScript();
		}
}
