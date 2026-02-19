abstract class Animal{
	protected int legs;

    protected Animal(int legs){
    	this.legs=legs;
    }

    abstract void eat();

    public void walk(){
    	System.out.println("Animal walks on "+legs+"legs ");
    }

}
class Spider extends Animal{

	public Spider(){
		super(8);
	}
	@Override
	public void eat(){
		System.out.println("Spider eats insects");
	}
}
interface Pet{

	public String getName();

	public void setName(String name);
     
     void play();
	}


class Cat extends Animal implements Pet{
	String name;

	public Cat(String name){
		super(4);
		this.name=name;

	}
	public Cat(){
		this("");

	}
	@Override
	public String getName(){
		return name;
	}
	@Override
	public void setName(String name){
		this.name=name;
	}
	@Override
	public void play(){
		System.out.println("cat plays with a ball");
	}
	@Override
	public void eat(){
		System.out.println("cat eat mouse");
	}

}
class Fish extends Animal implements Pet{
	private String name;

	public Fish(){
		super(0);
	}
	@Override
	public void eat(){
		System.out.println("fish eats flakes");
	}
	@Override
	public void walk(){
		System.out.println("fish cant walk");
	}
	@Override
	public String getName(){
		return name;
	}
	@Override
	public void setName(String name){
		this.name=name;
	}
	@Override
	public void play(){
		System.out.println("fish swims around playfully");
	}
}

class p7{
	
	public static void main(String[] args) {
		
		Fish f1=new Fish();
		Cat c1=new Cat();
		Animal a1=new Fish();
		Animal a2=new Spider();
		Pet p1=new Cat();

		f1.play();
		f1.eat();
		f1.walk();

		c1.play();
		c1.eat();
		c1.walk();

		p1.play();

		a1.walk();
		a1.eat();

		a2.eat();
		a2.walk();

	}
}