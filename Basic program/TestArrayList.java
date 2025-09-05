package project;

import java.util.ArrayList;
public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> citylist=new ArrayList<>();
		
		citylist.add("London");
		citylist.add("India");
		citylist.add("Denver");
		citylist.add("Paris");
		citylist.add("Tokoyo");
		
		System.out.println("List size: "+citylist.size());;
		System.out.println("Is tokoyo in the list? "+citylist.contains("Tokoyo"));
		System.out.println("The location of paris in the list? "+citylist.indexOf("Paris"));
		System.out.println("Is list empty? "+citylist.isEmpty());
		citylist.add(2,"xion");
		citylist.remove("Paris");
		citylist.remove(1);
		System.out.println(citylist.toString());
	}

}
