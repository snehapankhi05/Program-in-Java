package project;
interface printable1
{
	void print();
}
interface showable extends printable
{
	void show();
}
class A implements showable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("How are you?");
	}
}

public class Interface4Extends {

	public static void main(String[] args) {
		A obj=new A();
		obj.print();
		obj.show();
		
		

	}

}
