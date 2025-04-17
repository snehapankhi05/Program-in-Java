package project;

public class AccessModifier2 {

	public static void main(String[] args) 
	{
		AcessModifier a=new AcessModifier();
		//System.out.println("a= "+a.a); //This will not work as it is private
		System.out.println("b= "+a.b);
		System.out.println("c= "+a.c);
		System.out.println("d= "+a.d);
	}

}
