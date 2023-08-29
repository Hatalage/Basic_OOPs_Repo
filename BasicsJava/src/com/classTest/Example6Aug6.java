package com.classTest;

public class Example6Aug6 {
int roll;
String name;
int marks;
public Example6Aug6(int roll,String name, int marks)
{
	this.roll=roll;
	this.name=name;
	this.marks=marks;
}
public int getRoll()
{
	return roll;
}
public String getName()
{
	return name;
}
public int getMarks()
{
	return marks;
}
public static void sortRecords(Example6Aug6[] ex)
{
	int len=ex.length;
	for(int i=0;i<len;i++)
	{
		for(int j=0;j<len-1;j++)
		{
			if(ex[j].getMarks()>ex[j+1].getMarks())
			{
				Example6Aug6 temp=ex[j];
				ex[j]=ex[j+1];
				ex[j+1]=temp;
			}
		}
	}
}
public static void showRecords(Example6Aug6[] ex)
{
	for(Example6Aug6 e:ex)
	{
		System.out.println("Roll number:"+e.roll+" "+"Name: "+e.name+" "+"Marks: "+e.marks);
	}
}
public static void main(String[] args) {
	Example6Aug6[] ex=new Example6Aug6[5];
	ex[0]=new Example6Aug6(1,"Ram",90);
	ex[1]=new Example6Aug6(2,"Krishn",80);
	ex[2]=new Example6Aug6(3,"Shiv",70);
	ex[3]=new Example6Aug6(4,"Vaish",50);
	ex[4]=new Example6Aug6(5,"Sham",60);
	sortRecords(ex);
	showRecords(ex);
}
}
