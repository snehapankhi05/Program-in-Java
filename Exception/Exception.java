package project;

public class Exception {

	public static void main(String[] args) 
	{
		int number,divider;
		try
		{
			divider=0;
			number=10/divider;
			System.out.println("NOt print");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("division by zero");
			
		}
		System.out.println("after catch sttement");

	}

}
