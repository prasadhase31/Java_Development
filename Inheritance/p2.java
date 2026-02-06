//Hierachical Inheritance

class Student{
	public Student(){
		System.out.println("Student Information");
	}
}
class Id extends Student{
	public Id(){
		System.out.println("101");
	}
}
class Name extends Student{
	public Name(){
		System.out.println("Prasad");

	}
}
class Age extends Student{
	public Age(){
		System.out.println("22");
	}
}
class p2{
	
	public static void main(String[] args) {

		Id i = new Id();
        Name n = new Name();
        Age a = new Age();
		
	}
}