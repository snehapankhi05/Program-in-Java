package project;

import java.util.*;
public class ExcepFinally {

	public static void main(String[] args) {
		try
		{
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println(c);
			
		}
		finally
		{
			System.out.println("I am in finally block");
			System.out.println("hello");
		}
	}

}
