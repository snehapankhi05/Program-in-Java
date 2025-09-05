package project;

import java.util.*;
//tail Recursion
import java.util.Scanner;

public class TailRecursion {

static int printnumber(int n)
{
if (n<1)
{
return 0;
}
else
{
System.out.println(n);
return printnumber(n/2);
//System.out.println(n);
//return n;
}
}
public static void main(String[] args) {
int n;
System.out.println("Enter Number:");
Scanner r=new Scanner(System.in);
n=r.nextInt();
int result=printnumber(n);
System.out.println("Last Return Number="+result);
}
}