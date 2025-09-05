package project;

import java.util.Scanner;

public class Isprime
{
	    public static void main(String[] args)
	    {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter");
	        int num=sc.nextInt();
	        int count=0;
	        int flag=0;
	        
	     
	        
	        
	         
	            if(num==0 || num==1)
	            {
	                flag=1;
	                
	            }
	            for(int i=2;i<=num/2;i++)
	            {
	                if(num%i==0)
	                {
	                    flag=1;
	                    break;
	                }
	            }
	            
	        
	        if(flag==0)
            {
                System.out.println("num is prime");
            }
	        
	    }
	
}