import java.util.*;

class SmallNumber{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();

		list.add(57);
		list.add(32);
		list.add(12);
		list.add(98);

		int min=list.get(0);

		for(int num:list){
			if(num<min){
				min=num;
			}
		}
		System.out.println("Minimum Number is:"+min);
	}

}