import java.util.*;

public class List{
	
    public static void main(String[] args) {
    	
    	ArrayList<Integer> list=new ArrayList<>();

    	list.add(10);
    	list.add(20);
    	list.add(30);
    	list.add(40);
    	list.add(50);

    	list.remove(3);

    	list.size();

    	System.out.println(list.size());

    	System.out.println("Element at index 2:"+list.get(2));

    	list.set(1,80);
    	System.out.println("After set(1,80):"+list);

    	System.out.println(list.contains(59));
    }
}