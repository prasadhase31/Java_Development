abstract class Animal{
	protected int legs;

    protected Animal(int legs){
    	this.legs=legs;
    }

    public void eat();

    public void walk(){
    	System.out.println("Animal walk ");
    }

}
class Spider extends Animal{

	public Spider(){
		super(int legs);
	}
	public void eat();
}
interface Pet{

	String name;

	public String getName(){
		return name;
	}
	public void setName(String name){

	}
}



class p7{
	
	public static void main(String[] args) {
		

	}
}