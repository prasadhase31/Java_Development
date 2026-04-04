import java.util.*;
class RemoveEven{
	
	public static void main(String[] args) {
		
	LinkedList<Integer>list=new LinkedList<>();

	list.add(2);
	list.add(8);
	list.add(7);
	list.add(5);

	System.out.println("Original List:"+list);

	Iterator<Integer>it=list.iterator();

	 while(it.hasNext()){
	 	int num=it.next();
	 	if(num %2==0){
	 		it.remove();
	 	}
	 }
	 System.out.println("Updated List:"+list);
	}
}