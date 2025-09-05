package project;
class Test
{
	int disp(int x)
	{
		return x;
	}
	float disp(float x)
	{
		return x;
	}
	double disp(double x)
	{
		return x;
	}
}

public class Methodoverloading {

	public static void main(String[] args) 
	{
		Test s=new Test();
		System.out.println("Value of x is: " +s.disp(6));
		System.out.println("Value of x is: " +s.disp(6.6f));
		System.out.println("Value of x is: " +s.disp(5.6));
		

	}

}
