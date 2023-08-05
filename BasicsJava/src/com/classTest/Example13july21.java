package com.classTest;
class Super
{
	public int index=1;
}
class Example13july21 extends Super
{
	public Example13july21(int index) {
		this.index=index;
	}

public static void main(String args[])
{
	Example13july21 ex = new Example13july21(10);
	System.out.println(ex.index);
}
}
