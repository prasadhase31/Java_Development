
import java.util.*;
class Demo{
	
	public static void main(String[] args) {
		
		Queue<Integer> queue=new PriorityQueue<>();

		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);

		for(int num:queue){

			System.out.println(num);
		}
	}

}