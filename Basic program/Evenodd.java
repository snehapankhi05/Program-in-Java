package project;
import java.util.*;
public class Evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number");
		int num=sc.nextInt();
		FindEvenOdd(num);
		

	}
	public static void FindEvenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
