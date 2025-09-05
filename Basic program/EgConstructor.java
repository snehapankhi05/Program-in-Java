package project;

import java.util.*;

class Student
{
	int id;
	String name;
	
	Student(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("ID="+id+"\tName="+name);
	}
}

public class EgConstructor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("PLease enter id and name for student 1");
		int id=sc.nextInt();
		String name=sc.next();
		Student s1=new Student(id,name);
		System.out.println("PLease enter id and name for student 2");
		id=sc.nextInt();
		name=sc.next();
		Student s2=new Student(id,name);
		s1.display();
		s2.display();
	}

}
