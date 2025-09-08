package project;

import java.lang.Exception;


/*
 * 
import java.lang.Exception;


public class ExceptionThrow {
    public static void main(String[] args) {
        try 
        {
            checkAge(15);
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }

    //ye static class h isse main class me use krne ke liye obj banane ki zarurat nhi..jese c me hum func
    //func bnate h ye vahi h..yaha hum specially check age kr rhe h
    public static void checkAge(int age) 
    {
        if (age < 18) 
        {
            throw new RuntimeException("You are not an adult!");
        }
    }
}

 */
public class ExceptionThrow {
    public static void main(String[] args) {
        try 
        {
            checkAge(15);
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }

    //ye static class h isse main class me use krne ke liye obj banane ki zarurat nhi..jese c me hum func
    //func bnate h ye vahi h..yaha hum specially check age kr rhe h
    public static void checkAge(int age) 
    {
        if (age < 18) 
        {
            throw new RuntimeException("You are not an adult!");
        }
    }
}
