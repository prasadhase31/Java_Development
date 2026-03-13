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

	Synchronized1(Demo d){
		this.d=d;
	}
	public void run(){
		d.printNumbers();
	}
}
public class Test{
	public static void main(String[] args) {
		
		Demo d1=new Demo();

		Synchronized1 s1=new Synchronized1(d1);
		Synchronized1 s2=new Synchronized1(d1);

		s1.start();
		s2.start();
	}

}