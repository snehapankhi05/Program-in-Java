package project;
class Sample

{
	int a,b;
	Sample(int x)
	
	{
		a=x;
	}
	Sample(int x,int y)
	{
		a=x;
		b=y;
	}
	void show()
	{
		System.out.println("The value of a and b is: " +a);
		System.out.println("The value of a and b is: " +b);
	}
}

public class Constructor {

	public static void main(String[] args)
	{
		Sample A=new Sample(5);
		Sample B=new Sample(8,6);
		A.show();
		B.show();

	}

}
