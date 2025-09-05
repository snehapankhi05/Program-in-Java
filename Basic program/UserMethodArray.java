package project;

public class UserMethodArray {

	public static void main(String[] args) {
		int a[]= {30,20,1,10};
		min(a);
	}
	static void min(int a[])
	{
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
			
		}
		System.out.println(min);
	}

}
