import java.util.*;
class Reverse{
	
    public static void main(String[] args) {
    	
    	LinkedList<Integer> list=new LinkedList<>();

    	list.add(23);
    	list.add(76);
    	list.add(43);
    	list.add(32);

    	System.out.println("Original Elements:"+list);

    	LinkedList<Integer> reverse=new LinkedList<>();

    	for(int i=list.size()-1;i>=0;i--){
    		reverse.add(list.get(i));
    	}
    	System.out.println("Reverse Elements:"+reverse);
    }
}