import java.util.*;
class UpperCase{
	
	public static void main(String[] args) {
		
		List<String> list=Arrays.asList("prasad","siddhu");

		list.stream()
		    .map(String::toUpperCase)
		    .forEach(System.out::println);
	}
}