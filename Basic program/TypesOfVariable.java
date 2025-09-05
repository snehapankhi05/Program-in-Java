package project;

import java.util.*;
public class TypesOfVariable {
	int a; //instance variable
	static int b; //static variable

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			TypesOfVariable obj=new TypesOfVariable();
			int c; //local variable
			System.out.println("Please enter the value of instance variable a ");
			obj.a=sc.nextInt();
			System.out.println("Please enter the value of static variable b ");
			b=sc.nextInt();
			System.out.println("Please enter the value of local variable c ");
			c=sc.nextInt();
			System.out.println("Local variable ="+c+"\nInstance variable ="+obj.a+"\nStatic variable ="+b);
			System.out.println("Please update the value of instance variable a");
			obj.a=sc.nextInt();
			System.out.println("Please update the value of static variable b");
			b=sc.nextInt();
			System.out.println("Updated Instance variable= "+obj.a+"\nUpdated Static variable= "+b);
	}

}
