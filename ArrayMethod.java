package project;
import java.util.*;
public class ArrayMethod {

	public static void main(String[] args) {
		//defining an array of type String  
		//String countries[]=new String[11];
		String[] countries = {"Poland", "Nepal", "India", "Austria", "Japan", "Bhutan", "Canada", "France", "China", "Italy", "Germany"};   
		 
		Arrays.sort(countries);
		//prints the sorted array in ascending order   
		System.out.println(Arrays.toString(countries));  
		System.out.println(Arrays.binarySearch(countries,"India"));   
	}

}
