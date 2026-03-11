//The following example demonstrates what happens if you try to start a thread twice:

public class ThreadTwice extends Thread{
	public void run(){

	 System.out.println("Runnning....");
	}
	public static void main(String[] args) {
		
		ThreadTwice t1=new ThreadTwice();

		t1.start();
		t1.start();
	}
}