package project;


interface G
{
	public static final int p=100;
	void methodp();
}

interface G1 extends G
{
	public static final int p1=10;
	void methodp1();
}

interface G2 extends G
{
	public static final int p2=20;
	void methodp2();
}

interface G12 extends G
{
	public static final int p12=30;
	void methodp12();
}
public class InterfaceEx implements G12{
	public void methodp12()
	{
		System.out.println("P12 class method constant = "+p12);
	}
	public void methodp1()
	{
		System.out.println("P1 class method constant = "+G1.p1);
	}
	public void methodp2()
	{
		System.out.println("p2 class method constant = "+G2.p2);
	}
	public void methodp()
	{
		System.out.println("P class method constant = "+G.p);
	}

	public static void main(String[] args) {
		InterfaceEx ob=new InterfaceEx();
		ob.methodp();
		ob.methodp1();
		ob.methodp2();
		ob.methodp12();
	}

}
