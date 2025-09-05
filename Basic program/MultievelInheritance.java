package project;

class Base
{
	int basev=10;
	public void base()
	{
		System.out.println("I am base class");
	}
}

class Dervied extends Base
{
	int derivedv=20;
	public void derived()
	{
		System.out.println("I am dervied class");
	}
}

class Child extends Dervied
{
	int childv=60;
	public void child()
	{
		System.out.println("I am child");
	}
}
public class MultievelInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println("BAse var is= "+c.basev);
		c.base();
		System.out.println("dervied var is= "+c.derivedv);
		c.derived();
		System.out.println("child var is= "+c.childv);
		c.child();
	}

}
