package project;

class X
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	 void sum(int a,int b,int c)
	 {
		 System.out.println(a+b+c);
	 }
}

class Y extends X
{
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
}


public class MethodOverloadingex {

	public static void main(String[] args) {
		Y ob=new Y();
		ob.sum(3, 4);
		
		X ob1=new X();
		ob1.sum(6, 4);
		
		X ob2=new Y();
		ob2.sum(2, 3);
	}

}
