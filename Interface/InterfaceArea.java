package project;

interface Area
{
	final static float PI=3.14f;
	float computeArea(float x,float y);
}
class Rectangle1 implements Area
{
	public float computeArea(float x,float y)
	{
		return(x*y);
	}
}
class Circlearr implements Area
{
	public float computeArea(float x,float y)
	{
		return (PI*x*y);
	}
}

public class InterfaceArea {

	public static void main(String[] args) 
	{
		Rectangle1 obj=new Rectangle1();
		Circlearr obj2=new Circlearr();
		Area shape;
		shape = obj;
		System.out.println("area is " +shape.computeArea(23, 1));
		shape=obj2;
		System.out.println("arera of circle is" +shape.computeArea(2, 2));

	}

}
