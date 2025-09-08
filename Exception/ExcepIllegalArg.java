package project;

import java.util.*;
public class ExcepIllegalArg {

	public static void main(String[] args) {
		try
		{
			Excircle c1=new Excircle(5);
			Excircle c2=new Excircle(-5);
			
		}
		
		catch(IllegalArgumentException e)
		{
			System.out.println(e);
		}
	}

}

class Excircle
{
	double radius;
	
	Excircle(double radius)
	{
		setRadius(radius);
	}
	
	void setRadius(double radius) throws IllegalArgumentException
	{
		if(radius>=0)
		{
			this.radius=radius;
		}
		else
		{
			throw new IllegalArgumentException ("radius cannot be negative");
		}
	}
}
