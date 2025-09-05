package project;
import java.util.*;
class Validation
{
	private String snehapass = "sneha@105";
	private String riyapass="riya105";
	private String janvipass = "janvi123";
	 
	void sneha(String password)
	{
		if(snehapass.equals(password))
		{
			System.out.println("Hello ms sneha your password is correct");
		}
		else
		{
			System.out.println("sorry wrong password " +password);
		}
		
	}
	void riya(String password)
	{
		if(riyapass.equals(password))
		{
			System.out.println("hello ms riya your password is correct");
		}
		else
		{
			System.out.println("wrong password " +password);
		}
	}
	void janvi(String password)
	{
		if(janvipass.equals(password))
		{
			System.out.println("hello ms janvi your password is correct");
		}
		else
		{
			System.out.println("wrong password " +password);
		}
	}
}

public class Password {

	public static void main(String[] args) 
	{
		Validation auth = new Validation();
		Scanner ss= new Scanner(System.in);
		String password;
		System.out.println("Please enter username:");
		String username=ss.next();
		
		switch(username)
		{
		case "sneha":
		{
			System.out.println("Please enter your password");
			password=ss.next();
			auth.sneha(password);
			break;
		}
		case "riya":
		{
			System.out.println("Please enter your password");
			password = ss.next();
			auth.janvi(password);
			break;
		}
		case "janvi":
		{
			System.out.println("Please enter your password");
			password = ss.next();
			auth.janvi(password);
		}
		default:
		{
			throw new IllegalArgumentException(username+ " Does not exist");
		}
		}
	}

}
