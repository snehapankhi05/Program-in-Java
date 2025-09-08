package project;
import java.lang.Exception;

public class ExceptionFinally {

	public static void main(String[] args) 
	{
		try
		{
			int a;
			a=25/5;
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			
		}
		finally
		{
			System.out.println("Finally block is alwys excuetd");
		}
		System.out.println("rest of code");
		

	}

}
