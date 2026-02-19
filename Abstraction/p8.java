abstract class Employee{
	String name;
	double salary;

	public Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	abstract void calculateSalary();
		
}
class Manager extends Employee{

	public Manager(){
		super("Prasad",45000);
	}
	@Override
	public void calculateSalary(){
		System.out.println("Salary of Manager:"+salary);
	}
}
class Developer extends Employee{
	public  Developer(){
		super("Aryan",25000);
	}
	@Override
	public void calculateSalary(){
		System.out.println("Salary of Developer:"+salary);
	}
}
class Intern extends Employee{
	public Intern(){
		super("Mangesh",15000);
	}
	@Override
	public void calculateSalary(){
		System.out.println("Salary of Intern:"+salary);
	}
}

class p8{

public static void main(String[] args) {
		
		Employee e1=new Manager();
		Employee e2=new Developer();
		Employee e3=new Intern();

		e1.calculateSalary();
		e2.calculateSalary();
		e3.calculateSalary();
	}	
}