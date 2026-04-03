//Write a   Java  program to search an element in an array.

import java.util.*;
class Search{
	
	public static void main(String[] args) {
		
		//Scanner sc=new Scanner(System.in);

     ArrayList<Integer> list=new ArrayList<>();

     list.add(35);
     list.add(40);
     list.add(50);
     list.add(55);
     list.add(80);

     int key=40;

     boolean found=false;

     for(int num:list){
     	if(num==key){
     		found=true;
     		break;
     	}
     }
     if(found){
     	System.out.println("Element found:");
     }
     else{
     	System.out.println("Element not found");
     }
   

	}

}