package project;

import java.io.*;
public class FileCopyDemo {

	public static void main(String[] args) throws IOException
	{
		FileInputStream in=new FileInputStream("E:\\FIO.txt");
		FileOutputStream out=new FileOutputStream("E:\\CopyFIO.txt");
		int c;
		while((c=in.read())!=-1)
		{
			out.write(c);
		}
		in.close();
		out.close();
	}

}
