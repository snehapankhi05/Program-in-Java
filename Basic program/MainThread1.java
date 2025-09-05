package project;

public class MainThread1 {

	public static void main(String[] args) {
		for (int i=1;i<3;i++)
		{
			Multithreading1 t= new Multithreading1();
			Thread r=new Thread(t);
			r.start();
		}
	}

}

class Multithreading1 implements Runnable
{
	public void run()
	{
	for(int i=0;i<3;i++)
	{
		String test=Thread.currentThread().getName();
		System.out.println("Hello from "+test);
	}
	}
}