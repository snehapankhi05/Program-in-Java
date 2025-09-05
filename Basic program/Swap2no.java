package project;
import java.util.Scanner;

public class Swap2no {

	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Please enter two number");
		Scanner n=new Scanner(System.in);
		a=n.nextInt();
		b=n.nextInt();
		System.out.println("The value of a nd b before is: " +a+" " + b );
		c=a;
		a=b;
		b=c;
		System.out.println("The value of a nd b after swap is: " +a+ " "+ b );
		

	}

}
