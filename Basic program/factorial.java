package project;
import java.util.Scanner;

public class factorial{

	public static void main(String[] args) 
	{
		int n,mul;
		System.out.println("Please enter number for factorial");
		Scanner no = new Scanner(System.in);
		n=no.nextInt();
		factorial obj = new factorial();
	    mul = obj.fact(n);
	    System.out.println("Factorial of "+n+" :"+mul);
		

			
	}
	 int fact(int x)
	    {
	        if(x > 1)
	        {
	            return(x * fact(x - 1));
	        }
	        return 1;
	}
}
