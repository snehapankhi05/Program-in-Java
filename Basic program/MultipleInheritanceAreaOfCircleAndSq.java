package project;

class Circlear
{
	double radius=1.3;
	final double PIE=3.14;
}

class Square extends Circlear
{
	double length=5;
}

class Areaar extends Square
{
	double areaofcircle()
	{
		return radius*PIE;
	}
	
	double areaofsquare()
	{
		return length*length;
	}
}
public class MultipleInheritanceAreaOfCircleAndSq {

	public static void main(String[] args) {
		Areaar ar=new Areaar();
		System.out.println("The area of squarre is "+ar.areaofsquare());
		System.out.println("The area of circle is "+ar.areaofcircle());
		
	}

}
