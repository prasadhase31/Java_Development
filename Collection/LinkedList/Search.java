import java.util.*;
class Search{
	
	public static void main(String[] args) {
		
		LinkedList<Integer>list=new LinkedList<>();

		list.add(3);
		list.add(4);
		list.add(6);
		list.add(9);

        int key=6;
		boolean found=false;
       
       for(int num:list){
       	if(num==key){
       		found=true;
       		break;
       	}
       }
       if(found)
       System.out.println("Element found");
   else
   	System.out.println("Not found");
	}
}