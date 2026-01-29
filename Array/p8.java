class Patient{
	int id;
	String name;
	int tablet[];

	Patient(int id,String name,int tablet[]){
		this.id=id;
		this.name=name;
		this.tablet=tablet;
	}
	Patient(int id,String name){
		this.id=id;
		this.name=name;
	}
	void setTablets(int tablet[]){
		this.tablet=tablet;
	}
	void printDetails(){
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		System.out.println("Tablets :");

		for(int tab:tablet)
			System.out.println(" "+tab+"mg");
	}
}

class p8{
	public static void main(String[] args) {
		int arr[]={50,100,200};
		Patient p1=new Patient(1,"raj",arr);

		p1.printDetails();
		
	}


}