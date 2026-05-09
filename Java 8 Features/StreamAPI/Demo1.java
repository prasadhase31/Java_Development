import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.List;

class Demo1{
   
   public static void main(String[] args) {
   	
   	  List<Integer>list=Arrays.asList(2,4,7,8,6);//original list

   	  List<Integer> result=
   	  list.stream()

   	      //.forEach(System.out::println);
   	       .filter(x->x%2==0)
   	      .collect(Collectors.toList()); 

   	      System.out.println(result);
   }
	
}