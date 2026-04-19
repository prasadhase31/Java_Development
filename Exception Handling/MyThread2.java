class MyThread2 extends Thread{
	
	public MyThread2(){

		public void run(){
			System.out.println("Thread is running");
		}
	}
	public static void main(String[] args) {
		
		MyThread2 m=new MyThread2();
         

         m.start();

	}
}