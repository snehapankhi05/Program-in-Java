package project;

//Local variable — an auxiliary temporary variable that exists only while a particular function or a block of statements is executed

public class Localvariable {
	void display()
	{
		int a=10;
		System.out.println("The value of a is " +a);
	}

	public static void main(String[] args) {
		Localvariable l = new Localvariable();
		l.display();

	}

}
