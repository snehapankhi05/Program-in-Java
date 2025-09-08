package project;

public class ExcepRethrow {
	static void divide()
	{
		int x,y,z;
		
		try
		{
			x=6;
			y=0;
			z=x/y;
			System.out.println("div= "+z);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
	public static void main(String[] args) {
		divide();
	}

}
