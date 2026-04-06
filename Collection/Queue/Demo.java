
import java.util.*;
class Demo{
	
	public static void main(String[] args) {
		
		Queue<Integer> queue=new PriorityQueue<>();

		queue.offer(80);
		queue.offer(20);
		queue.offer(70);
		queue.offer(40);

		//for(int num:queue){

		System.out.println(queue.peek());

		queue.poll();

			System.out.println(queue);
		}
	}

//}