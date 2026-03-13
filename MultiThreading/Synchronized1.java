class Bank{
	int balance=1000;
    
    synchronized(this){
    balance = balance - amount;
}
	
}
class Synchronized1 extends Thread{
	Bank b;

	Synchronized(Bank b){
		this.b=b;
	}
	public void run(){
		b.withdraw(500);
	}
	public static void main(String[] args) {
		
		Bank b1=new Bank();

		Synchronized s1=new Synchronized(b1);
		Synchronized s2=new Synchronized(b1);

		s1.start();
		s2.start();
	}
}
