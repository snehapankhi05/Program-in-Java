package project;
import java.util.*;
public class MultiMethodEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[10];
		System.out.println("Please enter the elements");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		while(true)
		{
			System.out.println("Menu\n1)Addition\n2)Maximum\n3)search\n4)Exit");
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
				System.out.println("The max is "+maximum);
				break;
			case 3:
				int index,searchelement;
				System.out.println("Please enter the key");
				searchelement=sc.nextInt();
				index=search(arr,searchelement);
				if(index>=0)
				{
					System.out.println("The element at index is "+index);
				}
				else
				{
					System.out.println("The element not found ");
				}
				break;
			case 4:
				System.out.println("Exit");
				sc.close();
				return;
			default:
				System.out.println("Please enter the valid option");
					
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
