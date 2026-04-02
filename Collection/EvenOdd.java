//Write a   Java  program to count the total number of even and odd elements in an array.
import java.util.*;
class EvenOdd{
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();

		list.add(76);
		list.add(21);
		list.add(54);
		list.add(90);

		int evenCount=0;
		int oddCount=0;

		for(int num:list){
			if(num %2==0){
				evenCount++;
			}
			else{
				oddCount++;
			}
		}
		System.out.println("Even Element:"+evenCount);
		System.out.println("Odd Element:"+oddCount);
	}
}