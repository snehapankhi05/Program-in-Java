package project;

import java.util.*;
public class DemoVector {

	public static void main(String[] args) 
	{
		Vector<String> v=new Vector<>();
		v.add("Apple");
		v.add("banana");
		v.add("cherry");
		v.add("Date");
		
		System.out.println("Element at index 1= "+v.get(1));
		v.remove("banana");
		v.removeElement("date");
		System.out.println("Size of vector is: "+v.size());
		
		System.out.println("contains apple? "+v.contains("Apple"));
		
		System.out.println("The index of cherry is= "+v.indexOf("cherry"));
		System.out.println("Is vector empty? "+v.isEmpty());
		System.out.println("First element= "+v.firstElement());
		System.out.println("Capacity of vector is= "+v.capacity());
	}

}
