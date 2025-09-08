package project;

import java.io.*;
public class ExcepPrintWriter {

	public static void main(String[] args) throws FileNotFoundException
	{
		String data="This is text inside file";
		
		try
		{
			PrintWriter pout=new PrintWriter("E://abc.txt");
			int age=35;
			pout.printf("I am %d years old", age);
			pout.printf(data);
			pout.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
