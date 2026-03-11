
public class ThreadJoin extends Thread{
	public void run(){

	 System.out.println("Runnning....");
	}
	public static void main(String[] args) {
		
		ThreadJoin t1=new ThreadJoin();
		ThreadJoin t2=new ThreadJoin();


		t1.start();
		t1.join();
		
	}
}