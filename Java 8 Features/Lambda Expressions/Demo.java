import java.util.function.Predicate;
class Demo{
	
	public static void main(String[] args) {
		
		Predicate<Integer> p=x -> x>10;

		System.out.println(p.test(20));
		System.out.println(p.test(5));
	}
}