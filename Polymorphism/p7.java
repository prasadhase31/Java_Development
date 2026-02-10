 class Bank{
	private String name;
	private String address;
	private double interestRate;

   public Bank(String name,String address,double interestRate){
   	this.name=name;
   	this.address=address;
   	this.interestRate=interestRate;
   }

public double getInterestRate(){
	return interestRate;
}
}

class SBI extends Bank{

	public SBI(){
		super("SBI","Pune",6.5);
	}
	@Override
	public double getInterestRate(){
		return 6.5;
	}
}

class HDFC extends Bank{

	public HDFC(){
		super("HDFC","Mumbai",7.0);
	}
	@Override
	public double getInterestRate(){
		return 7.0;
	}
}


public class p7{
	
	public static void main(String[] args) {

		Bank b1=new SBI();
		Bank b2=new HDFC();

		System.out.println("SBI Interest:"+b1.getInterestRate());
        System.out.println("HDFC Interest:"+b2.getInterestRate());
	}

}