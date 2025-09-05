package project;
/*Develop a program which stores names of districts in Gujarat in array of string.
The arrays specified capacity to store five districts the user able to print name of district based on array index .
Example :(0 will print Ahmedabad) if the specified index is out of bound program will display the message out of bound
*/
import java.util.*;
public class District {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String name[]=new String[5];
		System.out.println("Enter 5 districts");
		for(int i=0;i<5;i++)
		{
			name[i]=sc.nextLine();
		}
		System.out.println("Please enter the index");
		int index=sc.nextInt();
		getDistrict(name,index);

	}
	public static void getDistrict(String name[],int index)
	{
		if(index>name.length)
		{
			System.out.println("Out of bound");
		}
		else
		{
			System.out.println(name[index]);
		}
	}

}
