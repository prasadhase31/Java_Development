import java.util.Date;
class Loan{
	private double annualInterest;
	private int noOfYears;
	private double loanAmount;
	private Date loanDate;

	public Loan(){
		this.annualInterest=2.5;
		this.noOfYears=1;
		this.loanAmount=1000;
		this.loanDate=new Date();
	}

	public Loan(double annualInterest,int noOfYears,double loanAmount){
		this.annualInterest=annualInterest;
		this.noOfYears=noOfYears;
		this.loanAmount=loanAmount;
		this.loanDate=new Date();
	}

	public double getAnnualInterest(){
		return annualInterest;
	}

	public int getNumberOfYears(){
		return noOfYears;
	}

	public double getLoanAmount(){
		return loanAmount;
	}

	public Date getLoanDate(){
		return loanDate;
	}

	public void setAnnualInterest(double annualInterest){
		this.annualInterest=annualInterest;
	}

	public void setNumberOfYears(Date noOfYears){
		this.noOfYears=noOfYears;
	}

	public void setLoanAmount(double loanAmount){
		this.loanAmount=loanAmount;
	}

	public double getMonthlyPayment(){
		double monthlyInterest=annualInterest/1200;
		double monthlyPayment=loanAmount*monthlyInterest/(1-(1/Math.pow(1+monthlyInterest,noOfYears*12)));
		return monthlyPayment;
	}

	public double getTotalPayment(){
		return getMonthlyPayment()*noOfYears*12;
	}
}


class p3{
	
	public static void main(String[] args) {
		

	}
}