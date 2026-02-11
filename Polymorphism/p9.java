class Vehicle{
	public void speed(){
		System.out.println("Vehicle Speed:");

	}
}

class Car extends Vehicle{
	@Override
	public void speed(){
		System.out.println("Car speed is 120km/h");
	}
}

class Bike extends Vehicle{
	@Override
	public void speed(){
		System.out.println("Bike speed is 80km/h");
	}
}


class p9{
	
	public static void main(String[] args) {
		
		Vehicle v1=new Car();
		Vehicle v2=new Bike();

		v1.speed();
		v2.speed();
	}
}