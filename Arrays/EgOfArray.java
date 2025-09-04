package project;

import java.util.*;
public class EgOfArray
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Please enter 10 elements");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		while(true)
		{
			System.out.println("Menu:\n1)addition\n2)maximum\n3)search\n4)exit");
			int choose=sc.nextInt();
			switch(choose)
			{
			case 1:
					int addition;
					addition=add(arr);
					System.out.println("The addition is "+addition);
					break;
			
			case 2:
					int maximum;
					maximum=max(arr);
					System.out.println("The maximum is "+maximum);
					break;
					
			case 3:
					int index,key;
					System.out.println("Enter the key you want to search");
					key=sc.nextInt();
					index=search(arr,key);
					if(index>=0)
					{
						System.out.println("the element is in index "+index);
					}
					else
					{
						System.out.println("Its is not found");
					}
					break;
			case 4:
					System.out.println("Exit");
					sc.close();
					return;
					
			default:
					System.out.println("Please select valid option");
			}
		}
	}


public static int add(int arr[])
{
	int add=0;
	for(int i=0;i<arr.length;i++)
	{
		add=add+arr[i];
	}
	return add;
}

public static int max(int arr[])
		{
			int max=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(max<arr[i])
				{
					max=arr[i];
				}
			}
			return max;
		}

public static int search(int arr[],int key)
{
	for(int i=0;i<arr.length;i++)
	{
		if(key==arr[i])
		{
			return i;
		}
	}
	return -1;
}
}