//Write a   Java  program to find the reverse of an array.


import java.util.*;
class Reverse{
	
	public static void main(String[] args) {
		
		ArrayList<Integer>list =new ArrayList<>();

		list.add(2);
		list.add(8);
		list.add(6);
		list.add(3);

     System.out.println("Original List:"+list);

     ArrayList<Integer>reverseList=new ArrayList<>();//reverse element store 

      for(int i=list.size()-1;i>=0;i--){
      	 reverseList.add(list.get(i));
      }
      System.out.println("Reversed List:"+reverseList);

		}
	}
