//Write a   Java  program to find maximum and minimum elements in an array.     


import java.util.*;

class MinMax{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();

		list.add(14);
		list.add(54);
		list.add(96);
		list.add(14);

        int max=list.get(0);
        int min=list.get(0);

		for(int num:list){
           if(num>max){
           	max=num;
           }
           if(num<min){
           	min=num;
           }
		}
       System.out.println("Maximum Number is:"+max);
       System.out.println("Minimum Number is:"+min);
	}

}