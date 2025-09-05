package project;

public class ObjectPass {

	public static void main(String[] args) {
		objpass ob1=new objpass(100,200);
		objpass ob2=new objpass(100,200);
		objpass ob3=new objpass(1,2);
		System.out.println("ob1==ob2 "+ob1.equalsTo(ob2));
		System.out.println("ob3==ob2 "+ob2.equalsTo(ob3));
	}

}


class objpass
{
	int a,b;
	objpass(int a,int b)
	{
		this.a=a;
		this.b=b;
		
	}
	
	boolean equalsTo(objpass ob)
	{
		return ob.a==a && ob.b==b;
	}
}