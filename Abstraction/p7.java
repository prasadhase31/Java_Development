abstract class Animal{
	protected int legs;

    protected Animal(int legs){
    	this.legs=legs;
    }

    abstract void eat();

    public void walk(){
    	System.out.println("Animal walks on legs ");
    }

}
class Spider extends Animal{

	public Spider(){
		super(int legs);
	}
	@Override
	public void eat(){
		System.out.println("Spider eats insects");
	}
}
interface Pet{

	String name;

	public String getName(){
		return name;
	}
	public void setName(String name);

	}
	void play();


class Cat extends Animal implements Pet{
	String name;

	public Cat(String name){
		super(int legs);
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
	public void eat()
}

class p7{
	
	public static void main(String[] args) {
		

	}
}