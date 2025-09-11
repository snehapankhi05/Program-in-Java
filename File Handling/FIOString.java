package project;

import java.io.*;

public class FIOString {

	public static void main(String[] args)throws FileNotFoundException,IOException {
		FileOutputStream fos=new FileOutputStream("E:\\FIO.txt");
		String s="Learning I/O stream";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.close();
		FileInputStream fis=new FileInputStream("E:\\FIO.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.println((char)i);
		}
		fis.close();
	}

}
