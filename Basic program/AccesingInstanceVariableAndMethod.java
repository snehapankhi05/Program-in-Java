package project;
class Man
{
	String name;
	public void setname(String manname)
	{
		name=manname;
	}
	public void showname()
	{
		System.out.println("The name is:" +name);
	}
}

public class AccesingInstanceVariableAndMethod {

	public static void main(String[] args) 
	{
		Man m=new Man();
		m.setname("sneha");
		m.showname();
		

	}

}
