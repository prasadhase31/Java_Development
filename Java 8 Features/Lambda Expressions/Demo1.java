import java.util.function.Function;
class Demo1{
	
	public static void main(String[] args) {
		

		//Function<Integer,Integer>f=x -> x*x;

		//System.out.println(f.apply(5));
      
      Function<Integer, Integer> square = x -> x * x;
      Function<Integer, Integer> cube = x -> x * x * x;

     System.out.println(square.andThen(cube).apply(2));

	}
}