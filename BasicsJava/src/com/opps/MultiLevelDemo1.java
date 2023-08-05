package com.opps;


	class Vehical
	{
		int wheels=4;
	}
	class Car extends Vehical
	{
		String name;
		public void showCar()
		{
			System.out.println(wheels);
		}
	}
	class BMW extends Car
	{
		public void input()
		{
			name="BMW";
		}
		public void ouput()
		{
			System.out.println(name);
		}
	}


	public class MultiLevelDemo1 {

		public static void main(String[] args) {
			
			BMW b=new BMW();
			b.input();
			b.ouput();
			b.showCar();
			System.out.println(b.wheels);
			

		}

	}

