package project;
class Aa
{
	void disp()
	{
		System.out.println("class A");
	}
}
class B extends Aa
{
	void show()
	{
		System.out.println("class B");
	}
}
class C extends B
{
	void getdata()
	{
		System.out.println("Class c");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) 
	{
		C obj = new C();
		obj.disp();
		obj.show();
		obj.getdata();

	}

}
