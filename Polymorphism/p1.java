abstract class Shape{
	String color="red";
	boolean filled=true;

	public Shape(String color,Boolean filled){
		this.color=color;
		this.filled=filled;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color=color;
	}

	public Boolean isFilled(){
		return filled;
	}
     
    public void setFilled(boolean filled){
    	this.filled=filled;
    }

    abstract double getArea();
    abstract double getPerimeter();

    public String toString(){
    	return "Shape[color="+ color +",filled="+ filled +"]";
    }
}

class Circle extends Shape{

	protected double radius=1.0;

	public Circle(double radius,String color,boolean filled){
		super(color,filled);
		this.radius=radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius=radius;
	}

	


}


class p1{
	
	public static void main(String[] args) {
		
	}
}