package Khush;

interface p11
{
	void walk();
}
interface p22
{
	void run();
}

public class InterfacePerson  implements p11,p22
{
	public void walk()
	{
		System.out.println("Person is walking");
	}
	
	public void run()
	{
		System.out.println("person is running");
	}
	
	public static void main(String[] args) {
		InterfacePerson ob=new InterfacePerson();
		ob.walk();
		ob.run();
	}

}
