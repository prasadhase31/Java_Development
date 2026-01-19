class Country{

	String name;
	long population;
	double area;

	Country(String name,long population,double area){

		this.name=name;
		this.population=population;
		this.area=area;
	}
	void displayDetails(){
		System.out.println("Name :"+name);
		System.out.println("population :"+population);
		System.out.println("Area :"+area ,"sq km");
	}
}

class Test1{
	
	public static void main(String[] args) {
		Country c1=new Country("India",14200000l,23377);
		c1.displayDetails();
		

	}
}