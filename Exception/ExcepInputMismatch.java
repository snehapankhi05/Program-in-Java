package project;

import java.util.*;
public class ExcepInputMismatch 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		try
		{
			System.out.println("Enter integer: ");
			int a=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			System.out.println(e);
		}
	}

}
