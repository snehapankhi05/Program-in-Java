package project;

import java.util.*;
public class DemoHashSet 
{

	public static void main(String[] args) 
	{
		HashSet<String> set=new HashSet<>();
		set.add("london");
		set.add("paris");
		set.add("new york");
		set.add("san fransisco");
		set.add("beijing");
		set.add("new york");
		
		System.out.println(set);

	}

}
