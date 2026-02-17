interface Shape{

	double calculateArea();
}

class Circle implements Shape{

	private double r;

	public Circle(double r){
		this.r=r;
	}
	public double calculateArea(){
		return Math.PI*r*r;
	}
}

class Rectangle implements Shape{
	private double length;
	private double width;

	public Rectangle(double length,double width){
		this.length=length;
		this.width=width;
	}
	public double calculateArea(){
		return length*width;
	}
}


class p3{
	public static void main(String[] args) {
		
		Shape s1=new Circle(5.0);
		Shape s2=new Rectangle(4.5,8.0);

		System.out.println("Area of circle:"+s1.calculateArea());
		System.out.println("Area of rectangle:"+s2.calculateArea());

	}
}