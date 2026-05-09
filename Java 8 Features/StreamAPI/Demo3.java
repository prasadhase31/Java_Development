import java.util.*;
class Demo3{
	
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(2,4,6,8);

		int product=list.stream()
		                .reduce(1,(a,b) -> a*b); //multiplication

		     System.out.println(product);
	}
}