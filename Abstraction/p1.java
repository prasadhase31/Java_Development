//using abstract class

abstract class Vehicle{
	
	abstract void start();

	void fuelType(){
		System.out.println("Vehicle uses fuel");
	}
}

class Car extends Vehicle{
	void start(){
	System.out.println("Car starts with key");
}
}

public class p1{
	public static void main(String[] args) {
		
		Vehicle v1=new Car();

		v1.start();
		v1.fuelType();
	}
}
