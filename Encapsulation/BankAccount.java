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

}