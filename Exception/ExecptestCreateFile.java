package project;
import java.io.*;
public class ExecptestCreateFile {

	public static void main(String[] args) throws IOException
	{
		File f=new File("E://xyz1.txt");
		if(f.createNewFile())
		{
		System.out.println("File created");
		}
		else
		{
			System.out.println("File is already exists");
		}
		System.out.println("====================");
		System.out.println("file exits? "+f.exists());
		System.out.println("length of file "+f.length());
		System.out.println("file readable? "+f.canRead());
		System.out.println("file writablee? "+f.canWrite());
		System.out.println("file directory? "+f.isDirectory());
		System.out.println("file hidden? "+f.isHidden());
		System.out.println("absolute path=  "+f.getAbsolutePath());
	}

}
