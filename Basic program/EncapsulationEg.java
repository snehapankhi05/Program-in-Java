package project;

import java.util.*;
public class EncapsulationEg {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		cat c =new cat();
		System.out.println(c.get());
		c.set(50);
		System.out.println(c.get());
	}

}

class cat
{
	private int weight=30;
	public int get()
	{
		return weight;
	}
	public void set(int weight)
	{
		this.weight=weight;
	}
}