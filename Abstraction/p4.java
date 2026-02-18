interface ATM{
	void withdraw();
	void transaction();
	void checkbalance();
}

class BankATM implements ATM{
	@Override
	public void withdraw(){
		System.out.println("Money withdraw");
	}
	@Override
	public void transaction(){
		System.out.println("Money Transaction");
	}
	@Override
	public void checkbalance(){
		System.out.println("Check bank balance");
	}
}

class p4{
	
	public static void main(String[] args) {
		
		ATM a1=new BankATM();

        a1.withdraw();
        a1.transaction();
        a1.checkbalance();

	}
}