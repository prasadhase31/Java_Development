package rentalpkg;

public class Rental{

    private int rentalId;
    private int custId;
    private String custName;
    private int noOfDays;
    private double totalAmount;

    public Rental(int rentalId,int custId,String custName,int noOfDays){

	 this.rentalId=rentalId;
	 this.custId=custId;
	 this.custName=custName;
	 this.noOfDays=noOfDays;
}
public int getNumberOfDays(){
	return noOfDays;
}
public void setTotalAmount(double totalAmount){
	this.totalAmount=totalAmount;
}
public void displayRentalDetails(){

	System.out.println("Rental Id :"+rentalId);
	System.out.println("Customer Id :"+custId);
	System.out.println("Customer Name :"+custName);
	System.out.println("Number Of Days :"+noOfDays);
	System.out.println("Total Payable Amount :"+totalAmount);
}
}