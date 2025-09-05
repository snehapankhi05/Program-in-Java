package project;

class Person
{
	String name="Sneha";
	void message()
	{
		System.out.println("This is person class");
	}
	Person()
	{
		System.out.println("This is person constructor");
	}
}

class Studentsn extends Person
{
	Studentsn()
	{
		super();
		System.out.println("Super constructor");
	}
	void message()
	{
		System.out.println("This is student  class");
	}
	void display()
	{
		super.message();
		System.out.println(super.name);
		message();
	}
}
public class SuperKeyword{
	
	public static void main(String[] args) {
		Studentsn s=new Studentsn();
		s.display();
	}

}
