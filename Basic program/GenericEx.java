package project;

public class GenericEx {

	public static void main(String[] args) 
	{
		
		        GenericClass<String> g = new GenericClass<>("Hello");
		        System.out.println(g.value);
	}
}

		class GenericClass<T> 
		{
		    T value;

		    public GenericClass(T value)
		    {
		        this.value = value;
		    }
		}


	
