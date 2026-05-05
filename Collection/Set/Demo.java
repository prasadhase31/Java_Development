import java.util.*;
class Demo{
	
	public static void main(String[] args) {
		
    HashSet<String>set=new HashSet<>();

    set.add("Prasad");
    set.add("Siddhu");
    set.add("Sharvil");
    set.add("Prasad");

    System.out.println(set);

    System.out.println(set.contains("Siddhu"));

    System.out.println(set.size());


	}
}