import java.util.List;
import java.util.Arrays;
class Demo{
	
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(10,20,33,40);

		list.stream() 
		    .filter(x -> x%2==0)
		    .forEach(System.out::println);

	}
}