class Animal{
	public int x=10;
	public void eat(){
		System.out.println("Eating");
	
	}	
}

		class Dog extends Animal{
		public int y=11;
		public void bark(){
			System.out.println("Bark");
		}
	}
class App{
	
	public static void main(String[] args) {
		Dog d1=new Dog();
		System.out.println(d1.x);
		System.out.println(d1.y);
		d1.eat();
		d1.bark();
		

	}
}