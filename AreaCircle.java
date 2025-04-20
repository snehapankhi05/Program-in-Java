package project;

public class AreaCircle {
	
	double radius;
	AreaCircle(double radius)
	{
		this.radius=radius;
	}
	
	AreaCircle()
	{
		this.radius=0.1;
	}
	
	void display()
	{
		System.out.println("Radius "+radius);
		System.out.println("Area= "+3.14*radius*radius);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaCircle c1=new AreaCircle();
		c1.display();
		AreaCircle c2=new AreaCircle(9.5);
		c2.display();
	}

}
