class MyThread extends Thread{
	
	public MyThread(String name,int priority){
		super(name);
		setPriority(priority);
	}
	public void run(){
		System.out.println(getName()+"with priority"+getPriority()+"is running");
	}
	public static void main(String args[]){

		MyThread t1=new MyThread("Thread 1",3);
		MyThread t1=new MyThread("Thread 2",7);
		MyThread t1=new MyThread("Thread 3",5);
		MyThread t1=new MyThread("Thread 4",7);
		MyThread t1=new MyThread("Thread 5",4);
	}
	}
	

	
