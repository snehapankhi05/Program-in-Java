package project;

import java.io.*;
public class FileDemoRandomAcess {

	public static void main(String[] args) throws IOException
	{
		try(RandomAccessFile r=new RandomAccessFile("E:\\random.txt","rw"))
				
		{
			r.setLength(0);
			for(int i=0;i<200;i++)
			{
				r.writeInt(i);
			}
			System.out.println("Current file length= "+r.length());
			r.seek(0);
			System.out.println("First = "+r.readInt());
			
			r.seek(2*4);
			System.out.println("Second= "+r.readInt());
			
			r.seek(9*4);
			System.out.println("ten= "+r.readInt());
			
			r.writeInt(555);
			r.seek(10*4);
			System.out.println("Second= "+r.readInt());
			
			r.seek(r.length());
			System.out.println("new length= "+r.length());
		}
	}

}
