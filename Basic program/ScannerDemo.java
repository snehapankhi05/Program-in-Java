package project;

import java.io.*;
import java.util.*;
public class ScannerDemo {
	public static void main(String args) throws FileNotFoundException
	{
		File f=new File("E://abc.txt");
		Scanner sc=new Scanner(System.in);
		String word;
		while(sc.hasNext())
		{
			word=sc.nextLine();
			System.out.println(word);
		}
	}

}
