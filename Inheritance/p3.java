class Circle{

	private double radius=1.0;
	private String color="Red";

	public Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius=radius;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color=color;

	}
	public double getArea(){
		double Area=Math.PI*radius*radius;
		return Area;
	}
	public String toString(){
		return "Circle[radius="+ radius +",color="+ color +"]";
	}
}
class Cylinder extends Circle{
	private double height=1.0;

	public Cylinder(double height,double radius,String color){
		super(radius,color);
		this.height=height;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double height){
		this.height=height;
	}
	public double getVolume(){
		return getArea()*height;
	}

}



class p3{
	
	public static void main(String[] args) {
		
		Cylinder c1=new Cylinder(5.0,10.0,"Blue");

		System.out.println(c1.toString());
		System.out.println("Height:"+c1.getHeight());
		System.out.println("Volume:"+c1.getVolume());


	}
}