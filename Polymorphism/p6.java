//Override//

class Shape{

	public void draw(){
		System.out.println("Draw Any Shape:");
	}
}
 class Circle extends Shape{
 	@Override
 	public void draw(){
 		System.out.println("Draw Circle:");
 	}
 }
 class Rectangle extends Shape{
 	@Override
 	public void draw(){
 		System.out.println("Draw Rectangle:");
 	}
 }

class p6{
	
	public static void main(String[] args) {

		Shape s1=new Circle();
		Shape s2=new Rectangle();

		s1.draw();
		s2.draw();
		
	}
}