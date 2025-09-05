package project;

import java.util.*;
public class DemoLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> n=new LinkedList<>();
		n.add(1);
		n.add(2);
		n.add(3);
		System.out.println("List= "+n);
		
		int number=n.get(2);
		System.out.println("Element at idex 2= "+number);
		
		n.set(2, 1000);
		System.out.println("Replaced third element= "+n);
		
		int removeEle=n.remove(1);
		System.out.println("Remove element at index 1= "+removeEle);
		
		System.out.println("List have 1000? "+n.contains(1000));
		n.remove(Integer.valueOf(1000));
		System.out.println("Removed element 1000,new list= "+n);
		
		n.clear();
		System.out.println("cleared list is= "+n);
		
	}

}
