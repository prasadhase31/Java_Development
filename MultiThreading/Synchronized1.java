class Demo{
	void printNumbers(){

		synchronized(this){
			for(int i=1;i<=5;i++){
				System.out.println(i);
			}
		}
	}
}
class Synchronized1 extends Thread{

	Demo d;
}