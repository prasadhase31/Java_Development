class student{
    static String college;
	public int id;
	public int batch;
	public int rollNo;
	public String name;
	private String address;

	student(String college,int id,int batch,int rollNo,String name,String address){

		this.college=college;
		this.id=id;
		this.batch=batch;
		this.rollNo=rollNo;
		this.name=name;
		this.address=address;
	}

	public void displayDetails(){

		System.out.println("College :"+college);
		System.out.println("Id :"+id);
		System.out.println("Batch :"+batch);
		System.out.println("Roll no :"+rollNo);
		System.out.println("Name :"+name);
		System.out.println("Address :"+address);
	}

}



class App{
	
	public static void main(String[] args) {
		
	student s1=new student("DY Patil",11,86,22,"Dyanu","FC Road");

	s1.displayDetails();

	}
}