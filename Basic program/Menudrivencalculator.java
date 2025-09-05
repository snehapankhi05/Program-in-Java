package project;
import java.util.Scanner;

public class Menudrivencalculator {


	public static void main(String[] args) 
	{
		int opt;
		double n1,n2,n;
		
		System.out.println("Select your option:");
		System.out.println("1=>addition \t 2=>subtraction  3=>multiplication  4=>division");
		Scanner input = new Scanner(System.in);
		opt=input.nextInt();
		switch(opt)
		{
		case 1:
		{
			System.out.println("Please enter two number for addition");
			n1=input.nextDouble();		
			n2=input.nextDouble(); 
			n=n1+n2;
			System.out.println("The addition of two number is =" +n);
			break;
		}
		case 2:
		{
			System.out.println("Please enter two number for subtraction");
			n1=input.nextDouble();		
			n2=input.nextDouble(); 
			n=n1-n2;
			System.out.println("The subtraction of two number is =" +n);
			break;
		
		}
		
		case 3:
		{
			System.out.println("Please enter two number for multiplication");
			n1=input.nextDouble();		
			n2=input.nextDouble(); 
			n=n1*n2;
			System.out.println("The multipication of two number is =" +n);
			break;
		}
		case 4:
		{
			System.out.println("Please enter two number for division");
			n1=input.nextDouble();		
			n2=input.nextDouble(); 
			n=n1/n2;
			System.out.println("The division of two number is =" +n);
			break;
		}
		default :
		{
			System.out.println("You have selected invalid option");
		}
		}
		
	}

}
