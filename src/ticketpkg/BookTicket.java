package ticketpkg;
import moviepkg.Movie;

class BookTicket{
	
	public static void main(String[] args) {
		
		Movie m1=new Movie(1,"Ekkis","Romantic",150,10);



		int tickets=6;
		double total=m1.calculatePrice(tickets);
		TicketBooking t1=new TicketBooking(11,101,"Aryan Shinde",6,total);

		m1.displayMovieDetails();
		System.out.println("----------------");
		t1.displayTicketDetails();
	}
}