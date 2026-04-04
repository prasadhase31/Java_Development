import java.util.*;
class Even{
	
	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<>();

		list.add(78);
		list.add(32);
		list.add(21);
		list.add(77);

		int count=0;

		for(int num:list){
			if(num % 2==0){
             count++;
			}
		}
		System.out.println("Even count:"+count);
	}
}