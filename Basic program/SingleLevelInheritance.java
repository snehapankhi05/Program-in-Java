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
public class SingleLevelInheritance {

	public static void main(String[] args) {
		Dervied d=new Dervied();
		System.out.println("Base var is ="+d.basev);
		d.base();
		System.out.println("Derived var is ="+d.derivedv);
		d.derived();
	}

}
