import java.util.*;
class Demo{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();

		list.add(12);
		list.add(45);
		list.add(76);

		Iterator<Integer> it=list.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}