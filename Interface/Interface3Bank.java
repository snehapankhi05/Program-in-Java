package project;
interface bank
{
	float ROI();
}
class Hdfc implements bank
{
	public float ROI()
	{
		return (9.5f);
		
	}
}
class SBI implements bank
{
	public float ROI()
	{
		return(9.6f);
	}
}

public class Interface3Bank {

	public static void main(String[] args) {
		bank roi = new Hdfc();
		bank roi2=new SBI();
		System.out.println("Rate of interst of hdfc is " + roi.ROI());
		System.out.println("Rate of interst of SBI is " + roi2.ROI());
		

	}

}
