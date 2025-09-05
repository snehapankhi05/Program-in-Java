package project;
interface printable12
{
	void print();
}
interface showable1
{
	void show();
}
class A1 implements printable12,showable1
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("How are you");
	}
}

public class MultipleInterface {

	public static void main(String[] args) {
		A1 obj=new A1();
		obj.print();
		obj.show();
		

	}

}
