package project;

import java.util.Scanner;

public class Largestbetween3 {

	public static void main(String[] args) {
		int n1,n2,n3;
		System.out.println("Enter three number in variable a,b,c");
		Scanner x = new Scanner(System.in);
		n1 = x.nextInt();
		n2 = x.nextInt();
		n3 = x.nextInt();
		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println("Value of a is largest");
			}
			else
			{
				System.out.println("Value of c is largest");
			}
		}
		else
		{
			if(n2>n3)
			{
				System.out.println("Value of b is largest");
			}
			else
			{
				System.out.println("Value of c is largest");
			}
		}
		

	}

}
