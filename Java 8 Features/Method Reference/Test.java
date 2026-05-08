interface Demo{
	
	Student get();
}

class Student{
	
	Student(){
	 System.out.println("Object Created");
	}
}

class Test{
	
	public static void main(String args[]){

	   Demo d=Student::new;

	   d.get();
	}
}