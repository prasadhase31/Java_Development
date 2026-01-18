class Booking{
	
	private int bookingId;
	private String departureDate;
	private int numberOfTickets;
	private double price;
	private double totalPrice;
	private String destination;
	private String cabinType;

	public Booking(int bookingId,String departureDate,int numberOfTickets,double price,String destination,String cabinType){

		this.bookingId=bookingId;
		this.departureDate=departureDate;
		this.numberOfTickets=numberOfTickets;
		this.price=price;
		this.totalPrice=totalPrice;
		this.destination=destination;
		this.cabinType=cabinType;
	}
	public void totalPrice(){
		totalPrice=numberOfTickets*price;
	}
	public void ticketConfirmation(){
		System.out.println("Booking Id :"+bookingId);
		System.out.println("Departure date :"+departureDate);
		System.out.println("Number of Tickets :"+numberOfTickets);
		System.out.println("Price :"+price);
		System.out.println("Total Price :"+totalPrice);
		System.out.println("Destination :"+destination);
		System.out.println("Cabin Type :"+cabinType);
		System.out.println("--------------------------------------");
		
		
	}
}

class Test{
 
	public static void main(String[] args) {
		
		Booking b1 = new Booking(101,"2026-12-02",3,30000,"Dubai","First class");

		b1.totalPrice();
		b1.ticketConfirmation();

		Booking b2 = new Booking(102,"2026-28-03",2,25000,"Italy","Business");

		b2.totalPrice();
		b2.ticketConfirmation();
	}
}