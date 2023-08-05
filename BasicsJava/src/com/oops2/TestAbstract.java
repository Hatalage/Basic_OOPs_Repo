package com.oops2;
abstract class Animal
{
	public String name;
	public Animal(String name) {
		this.name=name;
	}
	public abstract void makesound();
	public void eat()
	{
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal
{
	Dog(String name){
		super(name);
	}
	public void makesound()
	{
		System.out.println(name+" dog barks");
	}
}
class Cat extends Animal
{ 
	Cat(String name){
		super(name);
	}
	public void makesound()
	{
		System.out.println(name+" cat meows");
	}
}
public class TestAbstract {
 public static void main(String[] args) {
	Animal a = new Dog("max");
	a.eat();
	a.makesound();
	
	a=new Cat("luna");
	a.eat();
	a.makesound();
}
}
