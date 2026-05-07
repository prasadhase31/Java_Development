import java.util.function.Function;
class Demo{
	
	public static void main(String[] args) {
		

		Function<Integer,Integer>f=x -> x*x;

		System.out.println(f.apply(5));
	}
}