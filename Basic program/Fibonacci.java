package project;
import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter number: ");
		int num=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=3;i<=num;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
				
		
		}
		
	}

}
