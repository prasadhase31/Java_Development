import java.util.*;
class Max{
	
	public static void main(String[] args) {


		List<Integer>list=Arrays.asList(10,40,32,67);

		int max=list.stream()
		            .reduce(Integer.MIN_VALUE,(a,b) -> a > b ? a:b);
		            //.max(Integer::compare); //2nd option
		            .get();

		   System.out.println(max);

	}
}