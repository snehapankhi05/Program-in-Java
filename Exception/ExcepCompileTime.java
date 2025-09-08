package project;

import java.io.*;
public class ExcepCompileTime {

	public static void main(String[] args) throws FileNotFoundException {
		try
		{
			FileInputStream fis=new FileInputStream("E:/abcd.txt");
					
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}

}
