package project;

import java.util.*;
public class ExcepMulticatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		try
		{
			int n=Integer.parseInt(sc.nextLine());
			System.out.println(1/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
	}

}
