package project;

import java.io.*;
public class FISDemo {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		FileOutputStream fos=new FileOutputStream("E:\\FIO.txt");
		fos.write(98);
		
		FileInputStream fis=new FileInputStream("E:\\FIO.txt");
		int data=fis.read();
		System.out.println("data= "+data);
		fis.close();
		fos.close();
	}

}
