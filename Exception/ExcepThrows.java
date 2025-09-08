package project;

/*Here's an easy explanation:
What is "throws"?
"Throws" is a keyword in Java that is used to declare that a method may throw an exception.
How is "throws" used?
In the code, the checkAge method is declared with the throws Exception clause:

public static void checkAge(int age) throws Exception {
    throw new Exception("You are not an adult!");
}

This means that the checkAge method may throw an Exception.
Why is "throws" used?
The throws clause is used to warn other developers that the method may throw an exception. 
This allows them to prepare for the exception by using a try-catch block.

Example:

In the main method, we call the checkAge method inside a try-catch block:


try {
    checkAge(15);
} catch (Exception e) {
    System.out.println(e.getMessage());
}


This allows us to catch the exception thrown by the checkAge method and print its message.

That's it! The throws keyword is used to declare that a method may throw an exception, 
and it allows other developers to prepare for the exception by using a try-catch block.*/
import java.lang.Exception;

public class ExcepThrows
	{
    public static void main(String[] args) 
    {
        try 
        {
            checkAge(15);
        }
        catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }

    public static void checkAge(int age) throws Exception 
    {
        throw new Exception("You are not an adult!");
    }
}

