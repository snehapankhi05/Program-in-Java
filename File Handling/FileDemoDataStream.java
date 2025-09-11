package project;

//1)datainputstream and dataoutputstream

import java.io.*;
public class FileDemoDataStream {

	public static void main(String[] args) throws IOException
	{
		FileOutputStream fout=new FileOutputStream("E:\\Data.txt");
		DataOutputStream dout=new DataOutputStream(fout);
		dout.writeBoolean(true);
		dout.writeInt(123);
		dout.close();
		FileInputStream fin=new FileInputStream("E:\\Data.txt");
		DataInputStream din=new DataInputStream(fin);
		
		boolean f=din.readBoolean();
		int k=din.readInt();
		System.out.println(f+" "+k);
		din.close();
	}

}
