package ticketpkg;

public class TicketBooking{
	
	private int bookingId;
	private int custId;
	private String custName;
	private int noOfTickets;
	private double totalAmount;

	public TicketBooking(int bookingId,int custId,String custName,int noOfTickets,double totalAmount){
		this.bookingId=bookingId;
		this.custId=custId;
		this.custName=custName;
		this.noOfTickets=noOfTickets;
		this.totalAmount=totalAmount;
	}
   public void setBookingId(int bookingId){
      this.bookingId=bookingId;
   }
   public int getBookingId(){
   	 return bookingId;
   }
   public void displayTicketDetails(){
   	System.out.println("Booking Id :"+bookingId);
   	System.out.println("Customer Id :"+custId);
   	System.out.println("Customer Name :"+custName);
   	System.out.println("Number Of Tickets :"+noOfTickets);
   	System.out.println("Total Amount :"+totalAmount);
   }
}