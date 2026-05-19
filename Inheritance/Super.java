class Animal{

    Animal(){
    	System.out.println("Animal constructor");
    }

	void sound(){
		System.out.println("Animal make sound");
	}
}

class Dog extends Animal{

	Dog(){

		super();
		System.out.println("Dog constructor");
	}

	void sound(){
		System.out.println("dog barking");
	}

	void display(){
		sound();
		super.sound();
	}
}

class Super{
	
	public static void main(String[] args) {
		
		Dog d=new Dog();

		d.display();



	}
}