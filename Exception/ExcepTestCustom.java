package project;

class YoungerAgeException extends RuntimeException
{
	 YoungerAgeException(String msg)
	{
		super(msg);
	}
	 YoungerAgeException()
	{
		super("you are under age");
	}
}

public class ExcepTestCustom {
	static void validate(int age) throws YoungerAgeException
	{
		if(age<18)
		{
			throw new YoungerAgeException();
		}
		else
		{
			System.out.println("welcome to vote");
		}
	}

	public static void main(String[] args)
	{
		try
		{
			validate(14);
			
		}
		catch(YoungerAgeException e)
		{
			System.out.println(e);
		}
	}

}
