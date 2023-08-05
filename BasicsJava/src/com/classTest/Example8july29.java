package com.classTest;
class CodeA
{
	public String type="A";
	public CodeA()
	{
		System.out.println("CodeA");
	}
}
public class Example8july29 extends CodeA
{
	public Example8july29()
	{
		System.out.println("CodeB");
	}
void go()
{
	type ="B";
	System.out.println(this.type+super.type);
}
public static void main(String[] args) {
	new Example8july29().go();
}
}

