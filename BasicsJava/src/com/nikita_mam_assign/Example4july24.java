package com.nikita_mam_assign;
interface Playable
{
	public abstract void play();
}
class Football implements Playable
{

	@Override
	public void play() {
		System.out.println("Play the football");
	}
	
}
class Vollyball implements Playable
{

	@Override
	public void play() {
		System.out.println("Play the vollyball");
	}
	
}
class Basketball implements Playable
{

	@Override
	public void play() {
		System.out.println("Play the basketball");
	}
	
}
public interface Example4july24 {
	public static void main(String[] args) {
		Playable py = new Football();
		py.play();
		py=new Vollyball();
		py.play();
		py=new Basketball();
		py.play();
	}
}
