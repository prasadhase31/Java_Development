import java.util.*;
class Demo1{
	
	public static void main(String[] args) {


		ArrayList<String>list=new ArrayList<>();

		list.add("Virat");
		list.add("Dhoni");
		list.add("Rohit");
		list.add("Dhoni");

		System.out.println(list);
		
		HashSet<String> set=new HashSet<>(list);

		System.out.println(set);
	}
}