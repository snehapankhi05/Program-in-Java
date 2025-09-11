package project;
import java.io.File;
import java.io.IOException;
public class Filehandling {

	public static void main(String[] args) throws IOException
	{
		File f1=new File("c:/java/name.txt");
		f1.createNewFile();
		System.out.println("is exists" +f1.exists());
		System.out.println("File size:" +f1.length());
	}

}
