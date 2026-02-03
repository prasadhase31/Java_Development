package moviepkg;

public class Movie{
	
	private int movieId;
	private String title;
	private String genre;
	private double ticketPrice;
	private double discount;

   public Movie(int movieId,String title,String genre,double ticketPrice,double discount ){
    	this.movieId=movieId;
    	this.title=title;
    	this.genre=genre;
    	this.ticketPrice=ticketPrice;
    	this.discount=discount;
}
 public int  getMovieId(){
 	return movieId;
 }
 public String getTitle(){
 	return title;
 }
 public String getGenre(){
 	return genre;
}
public double getTicketPrice(){
	return ticketPrice;
}
public double calculatePrice(int tickets){
	double total=ticketPrice*tickets;

	if(tickets>=5){
		total=total-(total*discount/100);
	}
	return total;
}

public void displayMovieDetails(){
    System.out.println("Movie ID :"+movieId);
    System.out.println("Movie Title :"+title);
    System.out.println("Movie Genre :"+genre);
    System.out.println("Movie Ticket Price :"+ticketPrice);
}
}