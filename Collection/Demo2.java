import.java.util.*;

class Demo2{
	
	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<>();

		list.add(5);
		list.add(10);
		list.add(15);

		Iterator<Integer>it=list.iterator();

		while(it.hasNext()){
			int num=it.next();
			System.out.println(it.next());
		}
	}
}