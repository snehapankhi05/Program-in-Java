package project;

public class AcessModifier {
	private int a=10;
	public int b=20;
	protected int c=30;
	int d=40;
	public static void main(String[] args) {
		AcessModifier a=new AcessModifier();
		System.out.println("a= "+a.a);
		System.out.println("b= "+a.b);
		System.out.println("c= "+a.c);
		System.out.println("d= "+a.d);
	}

}
