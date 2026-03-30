import java.util.*;

class LargeNumber{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();

		list.add(45);
		list.add(18);
		list.add(7);
		list.add(99);
        
        int max=list.get(0);

        for(int num:list){
        	if(num>max){
        		max=num;
        	}
        }
		System.out.println("Maximum Number is:"+max);
	}
	

}