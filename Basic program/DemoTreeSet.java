package project;

import java.util.*;
public class DemoTreeSet {

	public static void main(String[] args) 
	{
		HashSet<String> set=new HashSet<>();
		set.add("london");
		set.add("paris");
		set.add("new york");
		set.add("san fransisco");
		set.add("beijing");
		set.add("new york");
		
		TreeSet<String>tset=new TreeSet<>(set);
		System.out.println(tset);
		System.out.println("First()= "+tset.first());
		System.out.println("last()= "+tset.last());
		System.out.println("PollLast()= "+tset.pollLast());
		System.out.println("PollFirst()= "+tset.pollFirst());
		System.out.println("New tree set= "+tset);
		
	}

}
