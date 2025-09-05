package project;

import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		List <String>l=new LinkedList<>();
		l.add("Apple");
		l.add("banana");
		l.add(2, "cherry");
		System.out.println(l);
		
		l.remove(1);
		System.out.println(l);
	}
}
