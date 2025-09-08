package project;

public class ExcepnestedTryCatch {

	public static void main(String[] args) {
		try
		{
			int a[]= {1,2,3};
			System.out.println(a[1]);
			
			try
			{
				int x=a[1]/0;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}

}
