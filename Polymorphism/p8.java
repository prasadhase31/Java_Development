class Employee{
	private int id;
	private String name;
	private double salary;

	public Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	public double calculateSalary(){
		return salary;

	}
}

class PermanentEmployee extends Employee{
	private double hra;
	private double basic;

	public PermanentEmployee(int id,String name,double salary,double hra,double basic){
	super(id,name,salary);
	this.hra=hra;
	this.basic=basic;

}

	@Override
	public double calculateSalary(){
		return basic + hra;
	
}
}

class ContractEmployee extends Employee{
	private double basic;
	
	public ContractEmployee(int id,String name,double salary,double basic){
		super(id,name,salary);
		this.basic=basic;
	}
	@Override
	public double calculateSalary(){
		return basic;
	}

}


class p8{
	
	public static void main(String[] args) {
		
		Employee e1=new PermanentEmployee(1,"Prasad",45000,50000,20000);
		Employee e2=new ContractEmployee(11,"Siddhu",60000,43000);

		System.out.println("Permanent salary:"+e1.calculateSalary());
		System.out.println("Contract salary:"+e2.calculateSalary());



	}
}