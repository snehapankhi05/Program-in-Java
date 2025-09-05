package project;

public class Studentdetails {
	String name;
	int ID;
	double percentage;
	String result;
	public void details(String studentname , int studentID, double studentpercentage,String studentresult )
	{
		ID=studentID;
		name=studentname;
		percentage=studentpercentage;
		result=studentresult;
		
	}
	public void show()
	{
		System.out.println("The name of student is:" + name);
		System.out.println("The Id of student is:" + ID);
		System.out.println("The percentage of student is:" + percentage );
		System.out.println("The result of student is:" + result);
	}
	

	public static void main(String[] args) 
	{
		Studentdetails you = new Studentdetails();
		you.details("SNEHA",2345,45,"pass");
		you.show();
		
		

	}

}
