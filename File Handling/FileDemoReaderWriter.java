package project;

import java.io.*;
public class FileDemoReaderWriter {

	public static void main(String[] args) throws IOException
	{
		FileWriter fw=new FileWriter("E:\\fwrite.txt");
		fw.write("hi");
		System.out.println("File wriite sucessfuly");
		fw.close();
		
		FileReader fr=new FileReader("E:\\fwrite.txt");
		int data=fr.read();
		System.out.println((char)data);
		fr.close();
	}

}
