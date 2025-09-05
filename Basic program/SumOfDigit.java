package project;

import java.util.*;
public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter number");
		int num=sc.nextInt();
		while(num!=0)
		{
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}
		System.out.println("The sum of digit is: "+sum);

	}

}
