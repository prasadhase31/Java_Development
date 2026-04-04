import java.util.*;
class Max{
	
	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<>();
		
		list.add(32);
		list.add(18);
		list.add(98);
		list.add(54);

		int max=list.get(0);

		for(int num:list){
			if(num>max){
              max=num;
			}
		}
		System.out.println("Maximum element is:"+max);
	}
}