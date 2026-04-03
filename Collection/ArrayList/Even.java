import java.util.*;

class Even{
	
	public static void main(String[] args) {
		
      ArrayList<Integer> list=new ArrayList<>();

      list.add(5);
      list.add(23);
      list.add(88);
      list.add(24);
      
      int count=0;

      for(int num:list){
      	if(num % 2==0){
      		count++;
      	}
      }
      System.out.println("Even count:"+count);


	}
}