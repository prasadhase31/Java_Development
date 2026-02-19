abstract class Shape{

	abstract double area();

	void display(){
		System.out.println("Display Shape");
	}
}
class Circle extends Shape{
	double r;

	public Circle(double r){
		this.r=r;
	}
	@Override
	public double area(){
		return Math.PI*r*r;
	}
	@Override
	public void display(){
		System.out.println("Area of circle:"+area());
	}

}
class Rectangle extends Shape{
	double length;
	double breadth;

	public Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public double area(){
		return length*breadth;

	}
	@Override
	public void display(){
		System.out.println("Area of rectangle:"+area());
	}

}
class Triangle extends Shape{
	double height;
	double base;

	public Triangle(double height,double base){
		this.height=height;
		this.base=base;
	}
	@Override
	public double area(){
		return 0.5*base*height;
	}
	@Override
	public void display(){
		System.out.println("Area of triangle:"+area());
	}
}
class p9{
	
	public static void main(String[] args) {
		
		Shape s1=new Circle(5);
		Shape s2=new Rectangle(4,6);
		Shape s3=new Triangle(3,7);

		s1.display();
		s2.display();
		s3.display();
	}
}