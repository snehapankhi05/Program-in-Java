package project;

import java.util.*;
public class PrintPrimeNo {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int count=0;
		int num=2;
		
		while(count<x)
		{
			int flag=0;
			for(int i=2;i<num;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num);
				count++;
			}
			num++;
		}
		
	}
}
