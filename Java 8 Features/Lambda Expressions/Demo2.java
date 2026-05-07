import java.util.function.Consumer;

class Demo2{
	
	public static void main(String[] args) {
		
		Consumer<String>c=x -> System.out.println(x);

		c.accept("Hello");
	}
}