import java.util.*;
class Min{
	
	public static void main(String[] args) {


		List<Integer>list=Arrays.asList(10,40,32,67);

		int min=list.stream()
		            .min(Integer::compare)
                    .get();

           System.out.println("Min"+min);
	}
}