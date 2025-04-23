package project;

import java.util.*;

class Student2
{
	int java;
	int co;
	int os;
}




public class ArrayObject {

	public static void main(String[] args) {
		Student2 stdarr[]=new Student2[3];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<stdarr.length;i++)
		{
			stdarr[i]=new Student2();
		}
		
		System.out.println("Enter elemenets");
		for(Student2 s:stdarr)
		{
			s.java=sc.nextInt();
			s.co=sc.nextInt();
			s.os=sc.nextInt();
		}
		
		System.out.println("java co os");
		for(Student2  x:stdarr)
		{
			System.out.println(x.java+"    "+x.co+"    "+x.os);
		}
	}

}

