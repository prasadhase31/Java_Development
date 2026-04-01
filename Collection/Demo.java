//using for-each loop

import java.util.*;

class Demo{

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();

		list.add(12);
		list.add(24);
		list.add(36);

		for(int num:list){
			System.out.println(num);
		}

	}
	

}