import java.util.*;
class EvenNumbers{

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(2,3,4,6,8,3,5,10);

		list.stream()
		    .filter(x -> x%2==0)
		    .forEach(System.out::println);
	}
	

}