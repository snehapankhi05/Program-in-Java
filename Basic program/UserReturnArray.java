package project;

public class UserReturnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=get();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

	}
	static int[] get()
	{
		int arr[]= {10,20,30,40};
		return arr;
	}

}
