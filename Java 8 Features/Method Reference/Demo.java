import java.util.function.Function;
class Demo{

	static int square(int x){
		return x * x;
	}
	
	public static void main(String[] args) {

		Function<Integer,Integer> f=Demo::square;

		System.out.println(f.apply(5));
		
	}
}