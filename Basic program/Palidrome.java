package project;
import java.util.*;
public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num=sc.nextInt();
		int fac=num;
		int rev=0;
		while(num!=0)
		{
			int n=num%10;
			rev=n+(rev*10);
			num=num/10;
			
			
		}
		if(rev==fac)
		{
			System.out.println("It is palidrome "+rev+"="+fac);
		}
		else
		{
			System.out.println("It is not palidrome "+rev+"="+fac);
		}
	}

}
