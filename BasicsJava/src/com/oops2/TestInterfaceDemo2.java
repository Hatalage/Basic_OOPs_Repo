package com.oops2;
interface language
{
	void showName(String name);
}
class ProgrammingLanguage implements language {

	@Override
	public void showName(String name) {
		System.out.println("Programming Language Name: "+name);
	}
	
}
class CommunicationLanguage implements language
{

	@Override
	public void showName(String name) {
		System.out.println("Communication language is: "+name);
		
	}
	
}
public interface TestInterfaceDemo2 {
	public static void main(String args[])
	{
		language ob = new ProgrammingLanguage();
		ob.showName("Python");
		ob=new CommunicationLanguage();
		ob.showName("English");
	}
}
