package project;

class Parent2 
{
	int a=10;
	void show()
	{
		System.out.println("Parrent's show()");
	}
}

class child2 extends Parent2
{
	int a=20;
	void show()
	{
		System.out.println("Child's show()");
	}
}
public class MethodOverrding {

	public static void main(String[] args) {
		Parent2 ob1=new Parent2();
		ob1.show();
		Parent2 ob2=new child2();
		ob2.show();
		System.out.println(ob2.a);
		child2 ob3=new child2();
		ob3.show();
		System.out.println(ob3.a);
		}

}
