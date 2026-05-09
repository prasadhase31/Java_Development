//Here all of the above are Intermediate Operations

import java.util.List;
import java.util.Arrays;
class Demo{
	
	public static void main(String[] args) {
		
		List<Integer>list=Arrays.asList(100,20,3,40,3,20,1,1);

		list.stream() 
		    //.filter(x -> x%2==0)
		    //.forEach(System.out::println);

		//.map(x -> x*2)
		//.forEach(System.out::println);


        //.sorted()
        //.forEach(System.out::println);

        //.distinct()
        //.forEach(System.out::println);

        .limit(3)
        .forEach(System.out::println);

	}
}