package project;
import java.util.*;

class Employee234
{
	String id;
	String name;
	double monthly_salary;
	
	Employee234()
	{
		id=null;
		name=null;
		monthly_salary=0.0;
	}
	
	void setId(String id)
	{
		this.id=id;
	}
	
	void setName(String name)
	{
		this.name=name;
	}
	
	void setMonthly_salary(double monthly_salary)
	{
		this.monthly_salary=(monthly_salary>0)?monthly_salary:0.0;
	}
	
	String getId()
	{
		return id;
	}
	
	String getName()
	{
		return name;
	}
	
	double getMonthly_salary()
	{
		return monthly_salary;
	}
	
	void display()
	{
		System.out.println("Employee id= "+id);
		System.out.println("Employee name= "+name);
		System.out.println("Employee monthly_salary= "+monthly_salary);
	}
	
}
public class EmployeeInfo {

	public static void main(String[] args) {
		Employee234 e1=new Employee234();
		Employee234 e2=new Employee234();
		
		Scanner sc =new Scanner(System.in);
		
		
		System.out.println("Please enter e1 id");
		String id=sc.nextLine();
		System.out.println("Please enter e1 name");
		String name=sc.nextLine();
		System.out.println("Please enter e1 monthly_salary");
		double monthly_salary=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Please enter e2 id");
		String id2=sc.nextLine();
		System.out.println("Please enter e2 name");
		String name2=sc.nextLine();
		System.out.println("Please enter e2 monthly_salary");
		double monthly_salary2=sc.nextInt();
		
		e1.setId(id);
		e1.setName(name);
		e1.setMonthly_salary(monthly_salary);
		sc.nextLine();
		
		e2.setId(id2);
		e2.setName(name2);
		e2.setMonthly_salary(monthly_salary2);
		sc.nextLine();
		
		e1.display();
		e2.display();
		
		System.out.println("Yearly salary of employee 1 : "+(e1.getMonthly_salary()*12));
		System.out.println("Yearly salary of employee 2 : "+(e2.getMonthly_salary()*12));
		System.out.println("Yearly salary of employee 1 with increment 10% : "+(e1.getMonthly_salary()*12*1.1));
		System.out.println("Yearly salary of employee 2 with increment 10% : "+(e2.getMonthly_salary()*12*1.1));


		
	}

}
