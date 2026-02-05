package rentalpkg;

import carpkg.Car;
//import rentalpkg.Rental;

import java.util.Scanner;

class CarRent{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
         
         //for Car Input
		System.out.println("Enter Car Id:");
		int carId=sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Model:");
		String model=sc.nextLine();

		System.out.println("Enter Brand:");
		String brand=sc.nextLine();

		System.out.println("Enter Rent Price Per Day:");
		double price=sc.nextDouble();

		System.out.println("Enter Discount:");
		double discount=sc.nextDouble();

		Car c1=new Car(carId,model,brand,price,discount);

		//for Rental Input
		System.out.println("Enter Rental Id:");
		int rentalId=sc.nextInt();

		System.out.println("Enter Customer Id:");
		int custId=sc.nextInt();

		System.out.println("Enter Customer Name:");
		String custName=sc.nextLine();

		System.out.println("Enter Number of Days Car On Rent:");
		int days=sc.nextInt();

		Rental r1=new Rental(rentalId,custId,custName,days);

		double totalAmount=c1.calculateRent(days);
		r1.setTotalAmount(totalAmount);

		c1.displayCarDetails();
		r1.displayRentalDetails();

	}
}