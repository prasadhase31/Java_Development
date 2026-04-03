//Write a   Java  program to count the total number of negative elements in an array.



import java.util.*;
class NegativeCount{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();

		list.add(87);
		list.add(-32);
		list.add(-2);
		list.add(3);

		int count=0;

		for(int num:list){
           if(num<0){
           	count++;
           }

		}
		System.out.println("Negative Element:"+count);
	}
}