package project;

interface f1
{
	void studentname();
}
interface f2 extends f1
{
	void studentInstitute();
}
public class InterfaceStudent implements f2 {
	public void studentname()
	{
		System.out.println("My name");
	}
	public void studentInstitute()
	{
		System.out.println("NJLIET");
	}
	

	public static void main(String[] args) {
		InterfaceStudent ob=new InterfaceStudent();
		ob.studentname();
		ob.studentInstitute();
	}

}
