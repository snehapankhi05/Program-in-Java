package project;
interface drawable
{
	void draw();
}
class Rectangle implements drawable
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
	
}
class Circle implements drawable
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}
}

public class Interface2 {

	public static void main(String[] args) {
		drawable obj= new Circle();
		drawable obj1= new Rectangle();
		obj.draw();
		obj1.draw();
		

	}

}
