package carpkg;

public class Car{
	
	private int carId;
	private String model;
	private String brand;
	private double pricePerDay;
	private double discount;

   public Car(int carId,String model,String brand,double pricePerDay,double discount){
   	this.carId=carId;
   	this.model=model;
   	this.brand=brand;
   	this.pricePerDay=pricePerDay;
   	this.discount=discount;
   }
   public double calculateRent(int days){
   	double total=pricePerDay*days;

   	if(days>5){
   		total=total-discount;
   	}
   	return total;
   }
   public void displayCarDetails(){

   	System.out.println("Car Id :"+carId);
   	System.out.println("Model :"+model);
   	System.out.println("Brand :"+brand);
   	System.out.println("Price Per Day :"+pricePerDay);

   }

}