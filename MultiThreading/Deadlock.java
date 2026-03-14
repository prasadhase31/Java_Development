class Deadlock{
		
		static final Object lock1=new Object();
		static final Object lock2=new object();

		public static void main(String[] args) {
			
			Thread t1=new Thread(){
				public void run(){
					synchronized(lock1){
						System.out.println("Thread 1:locked lock1");

						synchronized(lock2){
							System.out.println("Thread 1:locked lock2");
						}
					}
				}
			}
		}
	}
