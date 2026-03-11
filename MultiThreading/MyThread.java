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
		MyThread t2=new MyThread("Thread 2",3);
		MyThread t3=new MyThread("Thread 3",5);
		MyThread t4=new MyThread("Thread 4",7);
		MyThread t5=new MyThread("Thread 5",5);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	}
	

	
