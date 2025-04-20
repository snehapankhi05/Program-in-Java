package project;

public class ArrayCopyMethod {

	public static void main(String[] args) {
		char copyFrom[]= {'h','e','l','l','o','W','o','r','l','d'};
		char copyTo[]=new char[copyFrom.length];
		System.arraycopy(copyFrom, 5, copyTo, 0, 5);
		System.out.println(String.copyValueOf(copyTo));
	
	}

}
