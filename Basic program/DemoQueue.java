package project;

import java.util.*;
public class DemoQueue {

	public static void main(String[] args) 
	{
		Queue<String>que=new LinkedList<>();
		
		que.offer("Apple");
		que.offer("Banana");
		que.offer("Cherry");
		que.offer("Date");
		
		System.out.println("Queue= "+que);
		
		String FrontEle=que.poll();
		System.out.println("Front element removed= "+FrontEle);
		System.out.println("Updated queue is "+que);
		
	}

}
