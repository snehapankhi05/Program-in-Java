package project;

import java.io.*;
public class FileIOReaaderWriter {

	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		FileInputStream fin=new FileInputStream("E:\\abc.txt");
		InputStreamReader ir=new InputStreamReader(fin);
		FileOutputStream fout=new FileOutputStream("E:\\IoWriter.txt");
		OutputStreamWriter ow=new OutputStreamWriter(fout);
		
		int b;
		while((b=ir.read())!=-1)
		{
			ow.write(b);
		}
		ir.close();
		ow.close();
	}

}
