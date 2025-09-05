package project;
import java.lang.*;
public class Mainmultithreading1 {
	public static void main(String args[])
	{
		for(int i=1;i<3;i++)
		{
		Mythread t= new Mythread();
		t.start();
	}
	}
}

class Mythread extends Thread
{
	public void run()
	{
		for(int i=1;i<3;i++)
		{
			String test=Thread.currentThread().getName();
			System.out.println("Hello from "+test);
		}
	}
}