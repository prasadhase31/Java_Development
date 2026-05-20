abstract class Animal{
	
	Animal(){

		System.out.println("Animal Constructor");
	}
	abstract void sound();

	void sleep(){
		System.out.println("Animal Sleeping");
	}

}

class Dog extends Animal{

	Dog(){

		System.out.println("Dog Constructor");
	}
	void sound(){
		System.out.println("Dog barking");
	}

}
class Test{

	public static void main(String[] args) {
		
		Animal a=new Dog();
		//Dog d=new Dog();

		a.sound();
	}
}