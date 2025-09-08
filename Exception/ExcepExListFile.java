package project;

import java.io.*;
public class ExcepExListFile {

	public static void main(String[] args) {
		File f=new File("E:\\JavaProgram");
		String filename[]=f.list();
		for(String Filename:filename)
		{
			System.out.println(Filename);
		}

	}

}
