package project;
/*Develop a program which stores names of districts in Gujarat in array of string.
The arrays specified capacity to store five districts the user able to print index of district based on district.
Example :(Ahmedabad will print 0) if the specified index is out of bound program will display the message out of bound
*/
import java.util.*;
public class District2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String name[]=new String[5];
		System.out.println("Enter 5 districts");
		for(int i=0;i<5;i++)
		{
			name[i]=sc.nextLine();
		}
		System.out.println("Please enter the district");
		String district=sc.next();
		getDistrict(name,district);

	}
	public static void getDistrict(String name[],String district)
	{
		int i;
		boolean found=false;
		for(i=0;i<name.length ;i++)
		{
			if(district.equals(name[i]))
			{
			System.out.println("The index is "+i);
			found=true;
			break;
			}
			
		}
		if(found==false)
		{
			System.out.println("Out of bound");
		}
		




	}

}
