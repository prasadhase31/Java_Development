class Animal{

	void sound(){
		System.out.println("Animal make sound");
	}
}

class Dog extends Animal{

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
		

	}
}