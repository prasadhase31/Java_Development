interface Car{
	void brake();
	void accelerator();
	void steering();
}

class Drive implements Car{
	@Override
	public void brake(){
		System.out.println("Break pess");
	}
	@Override
	public void accelerator(){
		System.out.println("Pess Accelerate");
	}
	@Override
	public void steering(){
		System.out.println("Handle Steering");
	}
}

class p6{
	
	public static void main(String[] args) {
		
		Car c1=new Drive();

		c1.brake();
		c1.accelerator();
		c1.steering();

	}
}