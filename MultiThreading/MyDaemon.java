class MyDaemon extends Thread{
	
	public void run(){
		if(Thread.currentThread().isDaemon()){
			System.out.println("Daemon thread running");
		}
		else{
			System.out.println("User therad running");
		}
	}
	
}