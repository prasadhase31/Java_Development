 class Mobile{
	String brand;
	double price;
	int batteryLevel;
	boolean on;

	public Mobile(){
		brand="Realme";
		price=25000;
		batteryLevel=76;
		on=true;

	}

	public void turnOn(){
		if(batteryLevel>0){
		on=true;
	}
}

	public void turnOff(){
		if(batteryLevel<0){
		on=false;
	}
}

	public void chargeBattery(){
		batteryLevel=100;
	}

    public void usePhone(){
    	if(on && batteryLevel>=100){
    		batteryLevel-=10;
    	}
    	if(batteryLevel==0){
    		on=false;
    	}
    }
}



class p5{
	
	public static void main(String[] args) {
		
		Mobile m1=new Mobile();

		m1.turnOn();
		m1.usePhone();
		m1.usePhone();

		System.out.println("Battery:"+m1.batteryLevel);
		System.out.println("Mobile On:"+m1.on);

		m1.chargeBattery();
		System.out.println("Battery after charging:"+m1.batteryLevel);

	}
}