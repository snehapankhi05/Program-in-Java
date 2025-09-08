package project;
import java.lang.Exception;


public class Exception2 {

	public static void main(String[] args) 
	{
		try
		{
			int first=100,second=200;
			if(first<second)
			{
				throw new Exception ("first is less than second");
			}

		}
		catch(Exception excp)
		{
			System.out.println("exception " +excp.getClass());
		}

	}

}
