package com.nikita_mam_assign;
interface DemoTest
{
	int square(int num);
}
class Arithmetic implements DemoTest
{

	@Override
	public int square(int num) {
		
		return num*num;
	}
}
public interface Example2july24 {
	public static void main(String[] args) {
		Arithmetic a = new Arithmetic();
		int res = a.square(5);
		System.out.println("Square of num is: "+res);
	}
}
