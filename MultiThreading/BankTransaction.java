class BankTransaction extends Thread{
	
	private String transctionName;

	BankTransaction(String name){
		this.transctionName=name;
	}
	public void run(){
		System.out.println(transctionName+ "Started");
	try{
		Thread.sleep(3000);
	}
	catch(InterruptedException e){
		e.printStackTrace();
	}
	System.out.println(transctionName+ "Completed");
}


	public static void main(String[] args) {
		BankTransaction b1=new BankTransaction("Deposit");
		BankTransaction b2=new BankTransaction("Withdraw");

		b1.start();
		b2.start();
		

	}
}