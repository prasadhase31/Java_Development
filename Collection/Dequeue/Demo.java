import java.util.*;
class Demo{
	
	public static void main(String[] args) {
		
		Deque<Integer> dq=new ArrayDeque<>();

		dq.offer(10);
		dq.offer(20);

		dq.offerFirst(5);

		System.out.println(dq);

		dq.pollLast();

		System.out.println(dq);
	}
}