abstract class Animal{
	
	Animal(){

		System.out.println("Animal Constructor");
	}
}

class Dog extends Animal{

	Dog(){

		System.out.println("Dog Constructor");
	}

}
class Test{

	public static void main(String[] args) {
		
		Animal a=new Dog();
		//Dog d=new Dog();
	}
}