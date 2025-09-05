package project;

public class MainThread {

	public static void main(String[] args) {
		for (int i=1;i<3;i++)
		{
			Multithreading t= new Multithreading();
			t.start();
		}
	}

}

class Multithreading extends Thread
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