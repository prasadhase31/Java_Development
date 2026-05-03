class BankAccount{
	
	public int accountNo;
	private double balance;

	BankAccount(int accountNo,double balance){
		this.accountNo=accountNo;
		this.balance=balance;
}

   public void deposit(double amount){
   	 balance+=amount;

   }
   public void withdraw(double amount){
   	  balance -= amount;
   }
   
   public double getBalance(){
   	   return balance;
   }
}
public class Main{

	public static void main(String[] args) {
		
		BankAccount b1=new BankAccount(1000);

		b1.deposit(500);
		b1.withdraw(2000);

		System.out.println("Balance:"+b1.getBalance());
	}
}