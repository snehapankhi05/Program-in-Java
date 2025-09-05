package project;
import java.util.Scanner;
class Exam
{
	int add(int a,int b)
	{
		int c;   //local variable
		c=a+b;
		return c;
	}
}

public class Method {
	

	public static void main(String[] args) {
		Exam e1=new Exam();
		Scanner input = new Scanner(System. in );
        int number1,number2;
        System.out.println("Input two number: ");
        number1 = input.nextInt();
        number2=input.nextInt();        

		System.out.println(e1.add(number1,number2));
		

	}

}
