package project;


class SynchronBookTheatreSeat {

	int total_seat=10;
	
	synchronized void bookSeat(int seats)
	{
		if(total_seat>=seats)
		{
			System.out.println(seats+"book sucessfully");
			total_seat=total_seat-seats;
			System.out.println("seat left "+total_seat);
		}
		else
		{
			System.out.println("Seat not avaiable");
			System.out.println("Seat left:"+total_seat);
		}
	}
}
	public class SynchroMoviebook extends Thread
	{
		static SynchronBookTheatreSeat b=new SynchronBookTheatreSeat() ;
		int seats;
		public void run()
		{
			b.bookSeat(seats);
		}
		
	public static void main(String[] args) {
		SynchroMoviebook Reena =new SynchroMoviebook();
		Reena.seats=7;
		Reena.start();
		SynchroMoviebook smit=new SynchroMoviebook();
		smit.seats=6;
		smit.start();
	}

}