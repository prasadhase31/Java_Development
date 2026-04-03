//Write a   Java  program to insert an element in an array.

import java.util.*;
class Insert{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();

		list.add(8);
		list.add(6);
		list.add(3);
		list.add(4);

		System.out.println("Original List:"+list);

		list.add(3,2);//(index,element);

		System.out.println("Updated List:"+list);
	}
}