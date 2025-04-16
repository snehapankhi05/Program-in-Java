package project;


abstract class Bike
{
	double speed=80.5;
	Bike()
	{
		System.out.println("Bike is called");
	}
	abstract void run();
	
	final void changeGear()
	{
		System.out.println("gear sound");
	}
	
	void display()
	{
		System.out.println("this is bike class");
	}

}

class Honda extends Bike
{
	void run()
	{
		System.out.println("running honda");
	}
}

class Hero extends Bike
{
	void run()
	{
		System.out.println("Running hero");
	}
}
public class AbstractBike {

	public static void main(String[] args) {
		Bike b1=new Honda();
		//honda b1=new honda();
		b1.run();
		b1.changeGear();
		System.out.println("The speed is: "+b1.speed);
		
		Bike b2=new Hero();
		b2.run();
		b2.changeGear();
		
		
	}

}
