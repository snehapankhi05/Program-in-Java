package project;

interface Bankinter
{
	public abstract Float rateOfInterest();
}

class Hdfcbank implements Bankinter
{
	public  Float rateOfInterest()
	{
		return 9.2f;
	}
}

class Axis implements Bankinter
{
	public Float rateOfInterest()
	{
		return 8.2f;
	}
}
public class InterfaceBank {

	public static void main(String[] args) {
		Bankinter b1=new Hdfcbank();
		System.out.println("SBI ROI is= "+b1.rateOfInterest());
		
		Bankinter b2=new Axis();
		System.out.println("Axis ROI is = "+b2.rateOfInterest());
		
		
	}

}
