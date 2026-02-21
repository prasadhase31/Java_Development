class Cars{
	public String brand;
	public double price;
	public String model;

	Cars(String brand,double price,String model){
		this.brand=brand;
		this.price=price;
		this.model=model;
	}
    public String getModel(){
    	return model;
    }
    public void CarDetails(){
    	System.out.println("Brand of Car:"+brand);
    	System.out.println("Price of Car:"+price);
    	System.out.println("Model of Car:"+model);
    }
}

class Car{
	
	public static void main(String[] args) {
		
     Cars c1=new Cars("XUV",150000,"ABC");

     c1.CarDetails();
	}
}