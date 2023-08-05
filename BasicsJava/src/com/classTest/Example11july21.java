package com.classTest;
abstract class MotorVehicle
{
	public String modelName;
	public int modelNum;
	public int modelPrise;
	MotorVehicle(String modelName,int modelNum,int modelPrise)
	{
		this.modelName=modelName;
		this.modelNum=modelNum;
		this.modelPrise=modelPrise;
	}
	public void display()
	{
		System.out.println("Model name is: "+modelName);
		System.out.println("Model number is: "+modelNum);
		System.out.println("Model prise is: "+modelPrise);
	}
}
class Audi extends MotorVehicle
{
	float discountRate;
	Audi(String modelName,int modelNum,int modelPrise,float discountRate)
	{
		super(modelName,modelNum,modelPrise);
		this.discountRate=discountRate;
	}
	public void discount()
	{
		
		float dis=modelPrise-discountRate;
		System.out.println("Discount is: "+dis);
	}
	public void display()
	{
		super.display();
		System.out.println("Discount rate for car is: "+discountRate);
	}
}
public class Example11july21 {
		public static void main(String args[])
		{
			MotorVehicle mv = new Audi("BMW",1234,500000,100000);
			mv.display();
			Audi c = new Audi("BMW",1234,500000,100000);
			c.discount();
		}
}
