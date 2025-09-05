package project;

import java.util.*;
public class TakeDistinctNo {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		
		Scanner sc=new Scanner(System.in);
		int value=1;
		System.out.println("Enter numbers");
		while(value!=0)
		{
			value=sc.nextInt();
			if(!list.contains(value)&&value!=0)
			{
				list.add(value);
			}
		}
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i)+" ");
		}
	}

}
