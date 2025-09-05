package project;

import java.util.Arrays;
public class MethodsInArrays {

	public static void main(String[] args)
	{
		String Countries[]= {"Poland","Nepal","China","India"};
		Arrays.sort(Countries);
		System.out.println(Arrays.toString(Countries));
		System.out.println(Arrays.binarySearch(Countries, "India"));
	}

}
