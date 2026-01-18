class Rectangle{

	double length;
	double breadth;
	double area;

	Rectangle(double length,double breadth){
       
       this.length=length;
       this.breadth=breadth;
       area=length*breadth;

	}
	public void displayArea(){

		System.out.println("Length =" +length);
		System.out.println("Breadth =" +breadth);
		System.out.println("Area of Rectangle =" +area);
	}
}

class Area{
	
	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle(10,5);

		r1.displayArea();

	}
}