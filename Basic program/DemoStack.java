package project;

import java.util.*;
public class DemoStack {

	public static void main(String[] args) 
	{
		Stack<String> s=new Stack<>();
		s.push("Apple");
		s.push("Banana");
		s.push("Cherry");
		s.push("date");
		
		System.out.println("Top element= "+s.peek());
		System.out.println("Popped element= "+s.pop());
		System.out.println("Position of apple= "+s.search("Apple"));
		System.out.println("Is stack empty? "+s.isEmpty());
		System.out.println("Stack size= "+s.size());
		
	}

}
