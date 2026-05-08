import java.util.function.Consumer;
class Demo1{
	
	void display(String msg){
		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		Demo1 d=new Demo1();

		Consumer<String> c=d::display;

		c.accept("Hello");
	}
}