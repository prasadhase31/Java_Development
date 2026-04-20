class MyDaemon extends Thread{
	
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon thread running");
		}
		else{
			System.out.println("User therad running");
		}
	}
	public static void main(String[] args) {
		
		MyDaemon m1=new MyDaemon();
		MyDaemon m2=new MyDaemon();

		t1.setDaemon(true);

		t1.start();
		t2.start();
	}
}