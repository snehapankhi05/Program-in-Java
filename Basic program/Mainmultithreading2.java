package project;

public class Mainmultithreading2 {
	public static void main(String args[])
	{
		for(int i=1;i<3;i++)
		{
		Mythread2 r= new Mythread2();
		Thread t=new Thread(r);
		t.start();
	}
	}
}

class Mythread2 implements Runnable
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
