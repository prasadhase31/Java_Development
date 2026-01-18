class Employee{

	 int id;
	 String name;
	 double salary;

 Employee(int id,String name,double salary){

 	this.id=id;
 	this.name=name;
 	this.salary=salary;
 }

  public void displayDetails(){

  	System.out.println("Id :" +id);
  	System.out.println("Name :" +name);
  	System.out.println("Salary :" +salary);
  }

}


class Emp{
	
	public static void main(String[] args) {
		
		Employee e1=new Employee(1,"Aryan",55000);

		e1.displayDetails();

	}
}