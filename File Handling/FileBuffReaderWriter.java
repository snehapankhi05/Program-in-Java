package project;

import java.io.*;
public class FileBuffReaderWriter {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileReader fr=new FileReader("E:\\abc.txt");
		BufferedReader bufr=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter("E:\\BufWriter.txt");
		BufferedWriter bufw=new BufferedWriter(fw);
		
		int b;
		while((b=bufr.read())!=-1)
		{
			bufw.write(b);
		}
		bufr.close();
		bufw.close();
	}

}
