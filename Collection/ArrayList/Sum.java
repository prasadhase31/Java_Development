//Write a   Java  program to find the sum of all array elements.  

import java.util.*;

class Sum{

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();

		list.add(3);
		list.add(5);
		list.add(7);

		int sum=0;

		for(int num:list){
			sum+=num;
		}
		System.out.println("Sum of elements:"+sum);
	}
	

}