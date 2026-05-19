class Animal{

    Animal(){
    	System.out.println("Animal constructor");
    }
     
     String color="White";
     
	void sound(){
		System.out.println("Animal make sound");
	}
}

class Dog extends Animal{

	Dog(){

		super();
		System.out.println("Dog constructor");
	}
     
     String color="Black";
    
    void printColor(){
	System.out.println(color);
     	System.out.println(super.color);
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
        d.printColor();


	}
}