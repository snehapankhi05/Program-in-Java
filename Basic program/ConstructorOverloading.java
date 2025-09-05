package project;

import java.util.Scanner;

class Student1
{
	int id;
	String name;
	int age;
	
	Student1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	Student1(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public void display()
	{
		System.out.println("ID="+id+"\tName="+name);
	}
	
	public void display2()
	{
		System.out.println("ID="+id+"\tName="+name+"\tAge="+age);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("PLease enter id and name for student 1");
		int id=sc.nextInt();
		String name=sc.next();
		Student1 s1=new Student1(id,name);
		System.out.println("PLease enter id and name and age for student 2");
		id=sc.nextInt();
		name=sc.next();
		int age=sc.nextInt();
		Student1 s2=new Student1(id,name,age);
		s1.display();
		s2.display2();

	}

}
