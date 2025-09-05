package project;

public class MultidimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][][]= {{{10,20},{30,40}},{{50,60},{70,80}}};
		for(int table=0;table<arr.length;table++)
		{
			for(int row=0;row<arr[table].length;row++)
			{
				for(int column=0;column<arr[table][row].length;column++)
				{
					System.out.print(arr[table][row][column]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}
