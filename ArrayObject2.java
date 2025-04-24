package project;

import java.util.*;

class Student3
{
	String name;
	String Mname;
	String Surname;
}




public class ArrayObject2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of students");
		int n=sc.nextInt();
		Student3 stdarr[]=new Student3[n];
		
		
		for(int i=0;i<stdarr.length;i++)
		{
			stdarr[i]=new Student3();
		}
		
		
		for(Student3 s:stdarr)
		{
			System.out.println("\nEnter your name");
			s.name=sc.next();
			System.out.println("Enter your Middle name");
			s.Mname=sc.next();
			System.out.println("Enter your surname");
			s.Surname=sc.next();
			
		}
		
		System.out.println("\nName  Middlename  surname");
		for(Student3 s:stdarr)
		{
			System.out.println(s.name+"   "+s.Mname+"   "+s.Surname);
		}
	}

}

