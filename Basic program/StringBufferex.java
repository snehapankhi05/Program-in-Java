package project;

public class StringBufferex {

	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Welcome to java");
		System.out.println("Capacity:length*2+1: "+s1.capacity());
		System.out.println("length= "+s1.length());
		System.out.println("Substring= "+s1.substring(11));
		System.out.println("Substring from 0 to 6= "+s1.substring(0,7));
	}

}
