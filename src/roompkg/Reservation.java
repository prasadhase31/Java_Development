package reservationpkg;

public class Reservation{
	private int reservationId;
	private int custId;
	private String custName;
	private int noOfNights;
	private double totalAmount;

   public Reservation(int reservationId,int custId,String custName,int noOfNights){
     this.reservationId=reservationId;
     this.custId=custId;
     this.custName=custName;
     this.noOfNights=noOfNights;
   }
   public void setTotalAmount(double totalAmount){
   	 this.totalAmount=totalAmount;
   }
   public void displayReservationDetails(){
     System.out.println("Reservation Id :"+reservationId);
     System.out.println("Customer Id :"+custId);
     System.out.println("Customer Name :"+custName);
     System.out.println("Number Of Nights :"+noOfNights);
     System.out.println("Total Payable :"+totalAmount);

   }
     
}